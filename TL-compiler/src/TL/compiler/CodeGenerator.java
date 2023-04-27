package TL.compiler;

import TL.parser.TLBaseVisitor;
import TL.parser.TLParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class CodeGenerator extends TLBaseVisitor<String> {


    // when empty productions are visited, an empty string is returned

    @Override
    protected String defaultResult() {
        return "";
    }

    /*** Start of program ***/

    @Override
    public String visitProgram(TLParser.ProgramContext ctx) {
        return visit(ctx.block());

    }

    @Override
    public String visitBlock(TLParser.BlockContext ctx) {
        visitChildren(ctx);

        //check if it contains a functions block
        if (!(ctx.functionsBlock() == null)) {
            return visit(ctx.startBlock()) + visit(ctx.functionsBlock());
        } else {
            return visit(ctx.startBlock());
        }
    }

    /*** Expressions ***/
    @Override
    public String visitAskExp(TLParser.AskExpContext ctx) {
        return ctx.getRuleContext().getText() + "\n" +
                ctx.askID.getText() + " " + ctx.TEXT_VAL() + " " + ctx.NUMBER_VAL();
    }

    @Override
    public String visitPrintExp(TLParser.PrintExpContext ctx) {
        return ctx.getRuleContext().getText() + "\n" +
                ctx.TEXT_VAL() + " " + ctx.NUMBER_VAL();
    }

    @Override
    public String visitReturnExp(TLParser.ReturnExpContext ctx) {
        return super.visitReturnExp(ctx);
    }

    @Override
    public String visitMathExp(TLParser.MathExpContext ctx) {
        return super.visitMathExp(ctx);
    }

    @Override
    public String visitFuncCall(TLParser.FuncCallContext ctx) {
        return ctx.getRuleContext().getText() + "\n" + ctx.funcID.getText();
    }

    @Override
    public String visitFuncDec(TLParser.FuncDecContext ctx) {
        return ctx.getRuleContext().getText() + "\n" + ctx.funcID.getText() + visitChildren(ctx);
    }


    /*** Initialization ***/

    @Override
    public String visitNumberInit(TLParser.NumberInitContext ctx) {
        return ctx.getRuleContext().getText() + "\n" +
                  " " + ctx.ASSIGN() + " " + ctx.NUMBER_VAL();
    }

    @Override
    public String visitTextInit(TLParser.TextInitContext ctx) {
        return super.visitTextInit(ctx);
    }

    @Override
    public String visitBooleanInit(TLParser.BooleanInitContext ctx) {
        return super.visitBooleanInit(ctx);
    }


    @Override
    public String visitStructInit(TLParser.StructInitContext ctx) {
        return ctx.getRuleContext().getText();
    }

    /*** Declaration ***/
    @Override
    public String visitDeclaration(TLParser.DeclarationContext ctx) {
        return super.visitDeclaration(ctx);
    }

    /*** Statements ***/

    @Override
    public String visitIfThenStatement(TLParser.IfThenStatementContext ctx) {
        return super.visitIfThenStatement(ctx);
    }

    @Override
    public String visitIfThenElseStatement(TLParser.IfThenElseStatementContext ctx) {
        return super.visitIfThenElseStatement(ctx);
    }

    @Override
    public String visitWhileStatement(TLParser.WhileStatementContext ctx) {
        return super.visitWhileStatement(ctx);
    }

    @Override
    public String visitRepeatStatement(TLParser.RepeatStatementContext ctx) {
        return super.visitRepeatStatement(ctx);
    }

    @Override
    public String visitRepeatUntilStatement(TLParser.RepeatUntilStatementContext ctx) {
        return super.visitRepeatUntilStatement(ctx);
    }

    /*** Operations and conditions ***/


    @Override
    public String visitCondition(TLParser.ConditionContext ctx) {
        return super.visitCondition(ctx);
    }

    @Override
    public String visitOperation(TLParser.OperationContext ctx) {
        return super.visitOperation(ctx);
    }

    @Override
    public String visitConditionalOperation(TLParser.ConditionalOperationContext ctx) {
        return super.visitConditionalOperation(ctx);
    }

    @Override
    public String visitMathematicalOperation(TLParser.MathematicalOperationContext ctx) {
        return super.visitMathematicalOperation(ctx);
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

        return aggregate + "\n" + nextResult;
    }


}
