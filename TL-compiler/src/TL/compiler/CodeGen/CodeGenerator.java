package TL.compiler.CodeGen;

import TL.compiler.Listener.FuncDecListener;
import TL.compiler.Listener.GlobalDecListener;
import TL.compiler.SymbolTable.*;
import TL.parser.TLBaseVisitor;
import TL.parser.TLParser;
import org.stringtemplate.v4.ST;

import java.io.FileWriter;
import java.io.IOException;

public class CodeGenerator extends TLBaseVisitor<String> {

    SymbolTable symbolTable;
    FuncDecListener funcDecListener;
    GlobalDecListener globalDecListener;
    StringBuilder libs = new StringBuilder();
    StringBuilder globalDec = new StringBuilder();
    StringBuilder funcPrototypes = new StringBuilder();



    /** CST is used to create instances of functions used for visiting **/
    CST cst = new CST();

    public CodeGenerator(FuncDecListener f, GlobalDecListener g, SymbolTable s){
        this.funcDecListener = f;
        this.globalDecListener = g;
        this.symbolTable = s;
    }

    public StringBuilder getLibs(){
        libs.append("#include <stdbool.h>\n");
        libs.append("#include <stblib.h>\n");
        libs.append("#include <stdio.h>\n");
        libs.append("#include <math.h>\n");
        libs.append("#include <string.h>\n");

        return libs;
    }

    public StringBuilder getGlobalDec(){
        globalDec.append(globalDecListener.getGlobalDec());
        return globalDec;
    }
    public StringBuilder getFuncPrototypes(){
        funcPrototypes.append(funcDecListener.getPrototypes());
        return funcPrototypes;
    }


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
            return "\nint main() { " + "\n\n"  + visit(ctx.startBlock()) + "    return 0;\n}"
                    + visit(ctx.functionsBlock());
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
        cst.funcDec.getReturnType(ctx, symbolTable);

        openScope();

        // calls function that declare function type (translated to C's datatypes)
        String returnType = cst.funcDec.printReturnType(ctx, symbolTable);

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
                    + "{ \n" + printFuncBody + printReturnStmt + "}" + "\n\n" + closeScope();
        }
        // this is returned if it does not contain params
        return "\n\n" + returnType + " " + funcName + "() { \n" + visitChildren(ctx)
                + "}" + "\n\n" + closeScope();
    }
    @Override
    public String visitFuncOutputParam(TLParser.FuncOutputParamContext ctx) {
        return cst.funcOutParam.visitOutputParam(ctx, symbolTable);

    }
    @Override
    public String visitFuncInputParam(TLParser.FuncInputParamContext ctx) {
        return cst.funcInParam.visitInputParam(ctx, symbolTable);
    }
    @Override
    public String visitFuncCall(TLParser.FuncCallContext ctx) {
        if(ctx.param != null) {
            return "    " + ctx.funcID.getText() + "(" + visit(ctx.funcInputParam()) + ");" + "\n" ;
        }
        return "    " + ctx.funcID.getText() + "();" + "\n" ;
    }

    @Override
    public String visitFuncBody(TLParser.FuncBodyContext ctx) {
        return visitChildren(ctx);
    }

    /*** Declaration ***/
    @Override
    public String visitNumberDecl(TLParser.NumberDeclContext ctx) {
        return cst.numberDec.visitNumberDec(ctx, symbolTable);
    }
    @Override
    public String visitTextDecl(TLParser.TextDeclContext ctx) {
        return cst.textDec.visitTextDec(ctx, symbolTable);
    }
    @Override
    public String visitBoolDecl(TLParser.BoolDeclContext ctx) {
        return cst.boolDec.visitBoolDec(ctx, symbolTable);
    }


    /*** Initialisation ***/
    @Override
    public String visitNumberInit(TLParser.NumberInitContext ctx) {
        return cst.numberInit.visitNumberInitialisation(ctx, symbolTable);
    }
    @Override
    public String visitTextInit(TLParser.TextInitContext ctx) {
        return cst.textInit.visitTextInitialisation(ctx, symbolTable);
    }
    @Override
    public String visitBooleanInit(TLParser.BooleanInitContext ctx) {
        return cst.boolInit.visitBoolInitialisation(ctx, symbolTable);
    }

    /*** Expressions ***/
    @Override
    public String visitAskExp(TLParser.AskExpContext ctx) {
        return cst.askExp.visitAskExpr(ctx, symbolTable);
    }
    @Override
    public String visitPrintExp(TLParser.PrintExpContext ctx) {
        return cst.printExp.visitPrintExpr(ctx, symbolTable);
    }
    @Override
    public String visitReturnExp(TLParser.ReturnExpContext ctx) {
        return cst.returnExp.visitReturnExpr(ctx, symbolTable);
    }
    @Override
    public String visitMathExp(TLParser.MathExpContext ctx) {
        return cst.mathExp.visitMathExpr(ctx, symbolTable);
    }
    /*** Assignment ***/
    @Override
    public String visitAssignment(TLParser.AssignmentContext ctx) {
        return cst.assignment.visitAssign(ctx, symbolTable);
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
                + visit(ctx.statementBody(0)) + "\n    }" + closeScope();

        if(ctx.ELSE_IF() != null) {
            for(int i = 0; i > ctx.ELSE_IF().size(); i++) {
                printStatements += openScope() + "    else if (" + visit(ctx.condition((i + 1))) + ") {\n        "
                        + visit(ctx.statementBody((i + 1))) + "\n    }" + closeScope();
            }
        }
        if(ctx.ELSE() != null) {
            printStatements += openScope() + " else {\n" + visit(ctx.statementBody(0)) + "\n    }\n"
                    + closeScope();
        }

        return printStatements;
    }
    @Override
    public String visitWhileStatement(TLParser.WhileStatementContext ctx) {
        return openScope() + "    while (" + visit(ctx.condition()) + ") { \n"
                + visit(ctx.statementBody()) + "    }" + "\n" + closeScope();
    }
    @Override
    public String visitRepeatStatement(TLParser.RepeatStatementContext ctx) {
        return openScope() + "    for (int thisIsJustRandomIDxxx = 0; thisIsJustRandomIDxxx > " + ctx.numberVal.getText()
                + "; thisIsJustRandomIDxxx++ ) { \n" + visit(ctx.statementBody()) + "    }" + "\n" + closeScope();
    }
    @Override
    public String visitRepeatUntilStatement(TLParser.RepeatUntilStatementContext ctx) {
        return openScope() + "    while(!(" + visit(ctx.condition()) + ")) { \n"
                + visit(ctx.statementBody()) + "    }" + "\n" + closeScope();
    }

    /*** Conditions ***/
    @Override
    public String visitCon1(TLParser.Con1Context ctx) {
        // visits condition
        return cst.condition1.visitCondition1(ctx, symbolTable);
    }
    @Override
    public String visitCon2(TLParser.Con2Context ctx) {
        return cst.condition2.visitCondition2(ctx, symbolTable);
    }
    @Override
    public String visitCon3(TLParser.Con3Context ctx) {
        return cst.condition3.visitCondition3(ctx, symbolTable);
    }

    /*** Operations ***/
    @Override
    public String visitConditionalOperation(TLParser.ConditionalOperationContext ctx) {
        return cst.conOp.visitConOp(ctx);
    }
    @Override
    public String visitMathematicalOperation1(TLParser.MathematicalOperation1Context ctx) {
        return cst.mathOp1.visitMathOp1(ctx);
    }
    @Override
    public String visitMathematicalOperation2(TLParser.MathematicalOperation2Context ctx) {
        return cst.mathOp2.visitMathOp2(ctx);
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

