package TL.compiler;

import TL.parser.TLBaseVisitor;
import TL.parser.TLParser;
import org.antlr.v4.runtime.RuleContext;

public class MyVisitor extends TLBaseVisitor<String> {
    int i;
    @Override
    public String visitAskExp(TLParser.AskExpContext ctx) {


        return visitChildren(ctx) + "\n" + ctx.ASK() + "\n" + ctx.askID.getText() +
        "\n" +  "\n" + ctx.TEXT_VAL() + "\n" + ctx.NUMBER_VAL();

    }

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

    /*

    @Override
    public String visitReturnExp(TLParser.ReturnExpContext ctx) {
        visitChildren(ctx);

        for(i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) == ctx.varID) {
                System.out.println(ctx.varID.getText());
            }
            else {
                System.out.println(ctx.getChild(i));
            }
        }

        return null;
    }

    @Override
    public String visitProgram(TLParser.ProgramContext ctx) {

        visitChildren(ctx);
        if (ctx.getChildCount() >= 0) {
            for (i = 0; i < ctx.getChildCount(); i++) {
                if (ctx.getChild(i) == ctx.startBlock()) {

                    System.out.println(ctx.getChild(i).getText());


            }
                if (ctx.getChild(i) == ctx.functionsBlock()) {

                    System.out.println(ctx.getChild(i).getText());

                }
            }
        }
        return null;
    }

    @Override
    public String visitStartBlock(TLParser.StartBlockContext ctx) {

        return ctx.getText();


    }

    @Override
    public String visitStartBody(TLParser.StartBodyContext ctx) {

        visitChildren(ctx);
        if (ctx.getChildCount() >= 0) {
            for (i = 0; i < ctx.getChildCount(); i++) {
                //System.out.println(ctx.getChild(i).getText());

                if (ctx.getChild(i) == ctx.expression()) {}
                System.out.println(ctx.expression(i).getText());

            }
        }
        return null;

    }

    @Override
    public String visitExpression(TLParser.ExpressionContext ctx) {

        visitChildren(ctx);
        if (ctx.getChildCount() >= 0) {
            for (i = 0; i < ctx.getChildCount(); i++) {
                if (ctx.getChild(i) == ctx.askExp(i)) {
                    System.out.println("yooo   " + ctx.askExp(i).getText());
                }
            }
        }
        return null;
    }
    */

}
