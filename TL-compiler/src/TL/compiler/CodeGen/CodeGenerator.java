package TL.compiler.CodeGen;

import TL.compiler.Listener.FuncDecListener;
import TL.compiler.Listener.GlobalDecListener;
import TL.compiler.SymbolTable.*;
import TL.parser.TLBaseVisitor;
import TL.parser.TLParser;
import org.stringtemplate.v4.ST;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;

public class CodeGenerator extends TLBaseVisitor<String> {

    SymbolTable symbolTable;
    FuncDecListener funcDecListener;
    GlobalDecListener globalDecListener;
    StringBuilder libs = new StringBuilder();
    StringBuilder globalDec = new StringBuilder();
    StringBuilder funcPrototypes = new StringBuilder();
    StringBuilder mainFunc = new StringBuilder();
    StringBuilder funcDec = new StringBuilder();

    ArrayList<String> funcDecCode = new ArrayList<>();
    String mainCode;




    /** CST is used to create instances of functions used for visiting **/
    CST cst = new CST();

    public CodeGenerator(FuncDecListener f, GlobalDecListener g, SymbolTable s){
        this.funcDecListener = f;
        this.globalDecListener = g;
        this.symbolTable = s;
    }

    public StringBuilder getLibs(){
        // standard libraries
        // this is printed in BuildCProgram
        libs.append("#include <stdbool.h>\n");
        libs.append("#include <stblib.h>\n");
        libs.append("#include <stdio.h>\n");
        libs.append("#include <math.h>\n");
        libs.append("#include <string.h>\n");

        return libs;
    }

    public StringBuilder getGlobalDec(){
        // retrieve global symbol defined in globalDecListener
        // this is printed in BuildCProgram
        globalDec.append(globalDecListener.getGlobalDec());
        return globalDec;
    }
    public StringBuilder getFuncPrototypes(){
        // retrieve function prototypes defined in funcDecListener
        // this is printed in BuildCProgram
        funcPrototypes.append(funcDecListener.getPrototypes());
        return funcPrototypes;
    }
    public StringBuilder getMainFunc(){
        mainFunc.append(mainCode);
        return mainFunc;
    }
    public StringBuilder getFuncDec(){
        //get return types from funcDecListener
        ArrayList<String> returnType = funcDecListener.getReturnType();

        // loop that goes through func declaration and adds the right return type to functions
        for(int i = 0; i < funcDecCode.size(); i++)
        funcDec.append("\n" + returnType.get(i) + " " + funcDecCode.get(i));
        return funcDec;
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

        mainCode = "\nint main() { " + "\n\n"  + visit(ctx.startBlock()) + "    return 0;\n}";

        //check if it contains a functions block
        if (!(ctx.functionsBlock() == null)) {
            visit(ctx.functionsBlock());
        }
        return mainCode;
    }


    /*** Functions ***/
    @Override
    public String visitFuncDec(TLParser.FuncDecContext ctx) {
        String printFuncBody = "";
        String printReturnStmt = "";
        String printFuncDec = "";
        String funcName = ctx.funcID.getText();

        openScope();

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
            printFuncDec = funcName + "("  + outPutParam + ") "
                    + "{ \n" + printFuncBody + printReturnStmt + "}" + "\n\n" + closeScope();
        } else {
            // this is returned if it does not contain params
            printFuncDec =funcName + "() { \n" + visitChildren(ctx)
                    + "}" + "\n\n" + closeScope();
        }
        funcDecCode.add(printFuncDec);
        return printFuncDec;
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
        //checks if it contains params
        if(ctx.param != null) {
            return "    " + ctx.funcID.getText() + "(" + visit(ctx.funcInputParam()) + ");" + "\n" ;
        } else {
            return "    " + ctx.funcID.getText() + "();" + "\n" ;
        }
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
    public String visitAnswerVal(TLParser.AnswerValContext ctx) {
        return cst.answerExp.visitAnswerExp(ctx);
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
    /*** increment/decrement ***/

    @Override
    public String visitIncrement(TLParser.IncrementContext ctx) {
        String name = ctx.ID().getText();
        String incExp = "";
        if(symbolTable.isInScope(new Attributes(name, null))){
            incExp = name + ctx.INC().getText() + ";\n";
        } else {
            throw new IllegalArgumentException("Variable: " + name + " is not declared");
        }
        return incExp;
    }

    @Override
    public String visitDecrement(TLParser.DecrementContext ctx) {
        String name = ctx.ID().getText();
        String decExp = "";
        if(symbolTable.isInScope(new Attributes(name, null))){
            decExp = name + ctx.DEC().getText() + ";\n";
        } else {
            throw new IllegalArgumentException("Variable: " + name + " is not declared");
        }
        return decExp;
    }

    /*** Statements ***/
    @Override
    public String visitIfThenStatement(TLParser.IfThenStatementContext ctx) {
        return openScope() +  "    if(" + visit(ctx.condition()) + ") { \n"
                + visit(ctx.statementBody()) + "   } \n\n" + closeScope();
    }
    @Override
    public String visitIfThenElseStatement(TLParser.IfThenElseStatementContext ctx) {

        // maybe double check if this works

        String printStatements = openScope() + "    if(" + visit(ctx.condition(0)) + ") { \n"
                + visit(ctx.statementBody(0)) + "\n    }" + closeScope();

        if(ctx.ELSE_IF() != null) {
            for(int i = 0; i > ctx.ELSE_IF().size(); i++) {
                printStatements += openScope() + "    else if (" + visit(ctx.condition((i + 1))) + ") {\n        "
                        + visit(ctx.statementBody((i + 1))) + "\n    }" + closeScope();
            }
        }
        int size = ctx.statementBody().size();
        if(ctx.ELSE() != null) {
            printStatements += openScope() + " else {\n" + visit(ctx.statementBody(size - 1)) + "\n    }\n"
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

