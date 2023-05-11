package TL.compiler.CodeGen;

import TL.compiler.CodeGen.Visitors.*;
import TL.compiler.SymbolTable.*;
import TL.parser.TLBaseVisitor;
import TL.parser.TLParser;

public class CodeGenerator extends TLBaseVisitor<String> {


    public SymbolTable symbolTable = new SymbolTable();

    /******** Create instances of functions used for visiting ********/

    /** Function **/
    public FuncDec funcDec = new FuncDec();
    public FuncOutParam funcOutParam = new FuncOutParam();
    public FuncInParam funcInParam = new FuncInParam();

    /** Declaration **/
    public NumberDec numberDec = new NumberDec();
    public TextDec textDec = new TextDec();
    public BoolDec boolDec = new BoolDec();

    /** Initialisation **/
    public NumberInit numberInit = new NumberInit();
    public TextInit textInit = new TextInit();
    public BoolInit boolInit = new BoolInit();

    /** Expressions **/
    public Assignment assignment = new Assignment();
    public PrintExp printExp = new PrintExp();
    public AskExp askExp = new AskExp();
    public ReturnExp returnExp = new ReturnExp();

    /** Math expressions **/
    public MathExp1 mathExp1 = new MathExp1();
    public MathExp2 mathExp2 = new MathExp2();

    /** Conditions **/
    public Condition1 condition1 = new Condition1();
    public Condition2 condition2 = new Condition2();
    public Condition3 condition3 = new Condition3();

    /** Operations **/
    public ConOp conOp = new ConOp();
    public MathOp1 mathOp1 = new MathOp1();
    public MathOp2 mathOp2 = new MathOp2();

    /*********** Code Generation ***********/

    /*** If empty productions are visited, an empty string is returned ***/
    @Override
    protected String defaultResult() {
        return "";
    }

    /*** Functions that opens and closes scope ***/
    public String openScope() {
        symbolTable.openScope();
        return "";
    }
    public String closeScope() {
        symbolTable.closeScope();
        return "";
    }

    /*** Start of program ***/

    @Override
    public String visitProgram(TLParser.ProgramContext ctx) {
        return openScope() + visit(ctx.block()) + closeScope();
    }

    @Override
    public String visitBlock(TLParser.BlockContext ctx) {
        //check if it contains a functions block
        if (!(ctx.functionsBlock() == null)) {
            return "\nint main() { " + "\n\n"  + visit(ctx.startBlock()) + "    return 0;\n}" + visit(ctx.functionsBlock())
                    + "}";
        } else {
            return "\nint main() { " + "\n\n" + visit(ctx.startBlock()) + "   return 0;\n}";
        }
    }


    /*** Functions ***/
    @Override
    public String visitFuncDec(TLParser.FuncDecContext ctx) {
        String printFuncBody = "";
        String printReturnStmt = "";
        String funcName = ctx.funcID.getText();

        // calls function that get return type based on return type (void is default)
        funcDec.getReturnType(ctx, symbolTable);

        openScope();

        // calls function that declare function type (translated to C's datatypes)
        String returnType = funcDec.printReturnType(ctx, symbolTable);

        // check if function contains params
        if(ctx.param != null) {

            String outPutParam = visit(ctx.funcOutputParam());

            // visit function body
            for(int i = 0; i < ctx.funcBody().size(); i++) {
                printFuncBody += visit(ctx.funcBody(i));
            }
            // visit return expression if it exists
            if (ctx.returnExp() != null) {
                printReturnStmt += visit(ctx.returnExp());
            }

            // this is returned if it contains params
            return "\n\n" + returnType + " " +  funcName + "("  + outPutParam + ") "
                    + "{ \n\n" + printFuncBody + printReturnStmt + "}" + "\n\n" + closeScope();
        }
        // this is returned if it does not contain params
        return "\n\n" + returnType + " " + funcName + "() { \n\n" + visitChildren(ctx)
                + "}" + "\n\n" + closeScope();
    }
    @Override
    public String visitFuncOutputParam(TLParser.FuncOutputParamContext ctx) {
        return funcOutParam.visitOutputParam(ctx, symbolTable);

    }
    @Override
    public String visitFuncInputParam(TLParser.FuncInputParamContext ctx) {
        return funcInParam.visitInputParam(ctx, symbolTable);
    }
    @Override
    public String visitFuncCall(TLParser.FuncCallContext ctx) {
        if(ctx.param != null) {
            return "    " + ctx.funcID.getText() + "(" + visit(ctx.funcInputParam()) + ");" + "\n\n" ;
        }
        return "    " + ctx.funcID.getText() + "();" + "\n\n" ;
    }

    @Override
    public String visitFuncBody(TLParser.FuncBodyContext ctx) {
        return visitChildren(ctx);
    }

    /*** Declaration ***/
    @Override
    public String visitNumberDecl(TLParser.NumberDeclContext ctx) {
        return numberDec.visitNumberDec(ctx, symbolTable);
    }
    @Override
    public String visitTextDecl(TLParser.TextDeclContext ctx) {
        return textDec.visitTextDec(ctx, symbolTable);
    }
    @Override
    public String visitBoolDecl(TLParser.BoolDeclContext ctx) {
        return boolDec.visitBoolDec(ctx, symbolTable);
    }


    /*** Initialisation ***/
    @Override
    public String visitNumberInit(TLParser.NumberInitContext ctx) {
        return numberInit.visitNumberInitialisation(ctx, symbolTable);
    }
    @Override
    public String visitTextInit(TLParser.TextInitContext ctx) {
        return textInit.visitTextInitialisation(ctx, symbolTable);
    }
    @Override
    public String visitBooleanInit(TLParser.BooleanInitContext ctx) {
        return boolInit.visitBoolInitialisation(ctx, symbolTable);
    }

    /*** Expressions ***/
    @Override
    public String visitAskExp(TLParser.AskExpContext ctx) {
        return askExp.visitAskExpr(ctx, symbolTable);
    }
    @Override
    public String visitPrintExp(TLParser.PrintExpContext ctx) {
        return printExp.visitPrintExpr(ctx, symbolTable);
    }
    @Override
    public String visitReturnExp(TLParser.ReturnExpContext ctx) {
        return returnExp.visitReturnExpr(ctx, symbolTable);
    }
    @Override
    public String visitMathExp1(TLParser.MathExp1Context ctx) {
        return mathExp1.visitMathExpr1(ctx, symbolTable);
    }
    @Override
    public String visitMathExp2(TLParser.MathExp2Context ctx) {
        return mathExp2.visitMathExpr2(ctx, symbolTable);
    }

    /*** Assignment ***/
    @Override
    public String visitAssignment(TLParser.AssignmentContext ctx) {
        return assignment.visitAssign(ctx, symbolTable);
    }

    /*** Statements ***/
    @Override
    public String visitIfThenStatement(TLParser.IfThenStatementContext ctx) {
        return openScope() +  "    if(" + visit(ctx.condition()) + ") { \n"
                + visit(ctx.statementBody()) + "   } \n\n" + closeScope();
    }
    @Override
    public String visitIfThenElseStatement(TLParser.IfThenElseStatementContext ctx) {

        String printStatements = openScope() + "    if(" + visit(ctx.condition(0)) + ") { \n"
                + visit(ctx.statementBody(0)) + "\n   } \n" + closeScope();

        if(ctx.ELSE_IF() != null) {
            for(int i = 0; i > ctx.ELSE_IF().size(); i++) {
                printStatements += openScope() + "    else if (" + visit(ctx.condition((i + 1))) + ") {\n        "
                        + visit(ctx.statementBody((i + 1))) + "\n    }" + closeScope();
            }
        }
        if(ctx.ELSE() != null) {
            int size = ctx.statementBody().size();
            printStatements += openScope() + " else { " + visit(ctx.statementBody(size)) + "\n    }\n"
            + closeScope();
        }

        return printStatements;
    }
    @Override
    public String visitWhileStatement(TLParser.WhileStatementContext ctx) {
        return openScope() + "    while (" + visit(ctx.condition()) + ") { \n\n"
                + visit(ctx.statementBody()) + "    }" + "\n\n" + closeScope();
    }
    @Override
    public String visitRepeatStatement(TLParser.RepeatStatementContext ctx) {
        return openScope() + "    for (int thisIsJustRandomIDxxx = 0; thisIsJustRandomIDxxx > " + ctx.NUMBER_VAL()
                + "; thisIsJustRandomIDxxx++ ) { \n\n" + visit(ctx.statementBody()) + "    }" + "\n\n" + closeScope();
    }
    @Override
    public String visitRepeatUntilStatement(TLParser.RepeatUntilStatementContext ctx) {
        return openScope() + "    while(!(" + visit(ctx.condition()) + ")) { \n\n"
                + visit(ctx.statementBody()) + "    }" + "\n\n" + closeScope();
    }

    /*** Conditions ***/
    @Override
    public String visitCon1(TLParser.Con1Context ctx) {
        // visits condition
        return condition1.visitCondition1(ctx, symbolTable);
    }
    @Override
    public String visitCon2(TLParser.Con2Context ctx) {
        return condition2.visitCondition2(ctx, symbolTable);
    }
    @Override
    public String visitCon3(TLParser.Con3Context ctx) {
        return condition3.visitCondition3(ctx, symbolTable);
    }

    /*** Operations ***/
    @Override
    public String visitConditionalOperation(TLParser.ConditionalOperationContext ctx) {
        return conOp.visitConOp(ctx);
    }
    @Override
    public String visitMathematicalOperation1(TLParser.MathematicalOperation1Context ctx) {
        return mathOp1.visitMathOp1(ctx);
    }
    @Override
    public String visitMathematicalOperation2(TLParser.MathematicalOperation2Context ctx) {
        return mathOp2.visitMathOp2(ctx);
    }

    /*** Aggregator ***/
    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if(aggregate == null) {
            return nextResult;
        }
        if(nextResult == null) {
            return aggregate;
        }
        return aggregate + nextResult;
    }

}

