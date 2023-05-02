package TL.compiler;

import TL.compiler.Listener.VarDecListener;
import TL.compiler.SymbolTable.BaseScope;
import TL.compiler.SymbolTable.IScope;
import TL.compiler.SymbolTable.SymbolDefListener;
import TL.parser.TLBaseVisitor;
import TL.parser.TLParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class CodeGenerator extends TLBaseVisitor<String> {

    public SymbolDefListener symbolDefListener;

    public IScope scope;

    CodeGenerator(SymbolDefListener s, IScope i) {
        this.symbolDefListener = s;
        this.scope = i;
    }

    // when empty productions are visited, an empty string is returned

    @Override
    protected String defaultResult() {
        return "";
    }

    /*** Start of program ***/

    @Override
    public String visitProgram(TLParser.ProgramContext ctx) {

        return  visit(ctx.block());

    }

    @Override
    public String visitBlock(TLParser.BlockContext ctx) {
        //check if it contains a functions block
        if (!(ctx.functionsBlock() == null)) {
            return "\nint main() { " + "\n\n"  + visit(ctx.startBlock())  + "} " + visit(ctx.functionsBlock()) ;
        } else {
            return "\nint main() { " + "\n\n" + visit(ctx.startBlock()) + "}";
        }
    }

    /*** Expressions ***/
    @Override
    public String visitAskExp(TLParser.AskExpContext ctx) {

        return  "    char " + ctx.askID.getText() + "[]" + ";\n" +
                "    char temp;\n" +
                "    printf(" + visit(ctx.printBody()) + ");" +
                "\n    scanf(" + "\"%c\"" + "&temp);" +
                "\n    " + "scanf(" + "\"%[^\\n]\""  + ", " + ctx.askID.getText() + ");" +
                "\n\n";
    }

    @Override
    public String visitPrintExp(TLParser.PrintExpContext ctx) {
        return "    printf(" + visit(ctx.printBody()) + ");" + "\n\n";
    }

    @Override
    public String visitPrintBody(TLParser.PrintBodyContext ctx) {

        String val = ctx.getChild(0).getText();

        for (int i = 1; i < ctx.getChildCount(); i++) {
            val += " " + ctx.getChild(i).getText();
        }
        return val;
    }

    @Override
    public String visitReturnExp(TLParser.ReturnExpContext ctx) {
        return "    return " + visit(ctx.returnBody()) + ";" + "\n\n";
    }

    @Override
    public String visitReturnBody(TLParser.ReturnBodyContext ctx) {
        return ctx.getRuleContext().getText();
    }


    @Override
    public String visitFuncCall(TLParser.FuncCallContext ctx) {



        if (symbolDefListener.checkVar(ctx.funcID.getText(), scope)) {
            return "    " + ctx.funcID.getText() + "();" + "\n\n" ;
        } else {
            System.err.println("Error: Unknown function name.");
            return "";
        }

    }

    @Override
    public String visitFuncDec(TLParser.FuncDecContext ctx) {

        return "\n\n" + "void " + ctx.funcID.getText() + "(" + visit(ctx.funcOutputParam()) + ") " + "{ \n\n" + visitChildren(ctx) + "}" + "\n\n";
    }

    @Override
    public String visitFuncOutputParam(TLParser.FuncOutputParamContext ctx) {
        if(!(ctx.children.isEmpty())) {
            return "Not empty";
        } else {
            return "empty";
        }

    }

    /*** Initialization ***/


    @Override
    public String visitNumberInit(TLParser.NumberInitContext ctx) {


        if(ctx.NUMBER_VAL() != null) {
            if(symbolDefListener.checkVar(ctx.var1ID.getText(), scope)) {
                return "    " + ctx.var1ID.getText() + " = " + ctx.NUMBER_VAL() + ";" + "\n\n";
            } else {
                return "    int " + ctx.var1ID.getText() + " = " +  ctx.NUMBER_VAL() + ";" + "\n\n";
            }

        }
        if(ctx.var2ID != null) {
            if(symbolDefListener.checkVar(ctx.var1ID.getText(), scope)) {
                return "    " + ctx.var2ID.getText() + " = " + ctx.var2ID + ";" + "\n\n";
            } else {
                return "    int" + ctx.var2ID.getText() + " = " +  ctx.var2ID + ";" + "\n\n";
            }

        }
        return null;
    }


    @Override
    public String visitTextInit(TLParser.TextInitContext ctx) {

        if(ctx.TEXT_VAL() != null) {
            if(symbolDefListener.checkVar(ctx.var1ID.getText(), scope)) {
                return "    "  + ctx.var1ID.getText() + " = " + ctx.TEXT_VAL() + ";" + "\n\n";
            } else {
                return "    "  + "char " + ctx.var1ID.getText() + "[]" + " = " + ctx.TEXT_VAL() + ";" + "\n\n";
            }
        }

        if(ctx.var2ID != null) {

            if(symbolDefListener.checkVar(ctx.var1ID.getText(), scope)) {
                return "    "  + ctx.var1ID.getText() + " = " + ctx.var2ID.getText() + ";" + "\n\n";
            } else {
                return "    "  + "char " + ctx.var1ID.getText() + "[]" + " = " + ctx.var2ID.getText() + ";" + "\n\n";
            }
        }
        return null;
    }

    @Override
    public String visitBooleanInit(TLParser.BooleanInitContext ctx) {



        if(ctx.BOOL_LITERAL() != null) {
            if(symbolDefListener.checkVar(ctx.var1ID.getText(), scope)) {
                return "    " + ctx.var1ID.getText() + " = "+ ctx.BOOL_LITERAL().getText() + ";" + "\n\n";
            } else {
                return "    bool " + ctx.var1ID.getText() + " = "+ ctx.BOOL_LITERAL().getText() + ";" + "\n\n";
            }



        }
        if(ctx.var2ID != null) {
            if (symbolDefListener.checkVar(ctx.var1ID.getText(), scope)) {
                return "    " + ctx.var1ID.getText() + " = "+ ctx.var2ID.getText() + ";" + "\n\n";
            } else {
                return "    bool " + ctx.var1ID.getText() + " = "+ ctx.var2ID.getText() + ";" + "\n\n";
            }

        }
        return null;
    }

    /*** Declaration ***/
    @Override
    public String visitNumberDec(TLParser.NumberDecContext ctx) {
        return "    int " + ctx.ID().getText() + ";" + "\n\n";
    }

    @Override
    public String visitTextDec(TLParser.TextDecContext ctx) {
        return "    char " + ctx.ID().getText() +"[]" + ";" + "\n\n";
    }

    @Override
    public String visitBoolDec(TLParser.BoolDecContext ctx) {
        return "    bool " + ctx.ID().getText() + ";" + "\n\n";
    }

    /*** Statements ***/

    @Override
    public String visitIfThenStatement(TLParser.IfThenStatementContext ctx) {
        return "    if(" + visit(ctx.condition()) + ") { \n\n" + visit(ctx.statementBody()) + "   }" + "\n\n";
    }

    @Override
    public String visitIfThenElseStatement(TLParser.IfThenElseStatementContext ctx) {
        return super.visitIfThenElseStatement(ctx);
    }


    @Override
    public String visitWhileStatement(TLParser.WhileStatementContext ctx) {
        return "    while(" + visit(ctx.condition()) + ") { \n\n" + visit(ctx.statementBody()) + "    }" + "\n\n";
    }

    @Override
    public String visitRepeatStatement(TLParser.RepeatStatementContext ctx) {
        return "    for" + "(" + "int i = 0; " + "i > " + ctx.NUMBER_VAL() + "; " + "i++ ) { \n\n"
                + visit(ctx.statementBody()) + "    }" + "\n\n";
    }

    @Override
    public String visitRepeatUntilStatement(TLParser.RepeatUntilStatementContext ctx) {
        return "    while(!(" + visit(ctx.condition()) + ")) { \n\n" + visit(ctx.statementBody()) + "    }" + "\n\n";
    }


    @Override
    public String visitCon1(TLParser.Con1Context ctx) {
        return ctx.leftCon.getText() + visit(ctx.rightCondition());
    }

    @Override
    public String visitCon2(TLParser.Con2Context ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitCon3(TLParser.Con3Context ctx) {
        return "!(" + ctx.ID().getText() + ")";
    }

    @Override
    public String visitRightCondition(TLParser.RightConditionContext ctx) {
        return visit(ctx.op) + ctx.rightCon.getText();
    }

    @Override
    public String visitMathExp1(TLParser.MathExp1Context ctx) {

        String print = ctx.getChild(0).getText();

        for(int i = 1; i < ctx.getChildCount(); i++) {

            print += " " + ctx.getChild(i).getText();

        }
        return "    " + print + "\n\n";
    }

    @Override
    public String visitMathExp2(TLParser.MathExp2Context ctx) {
        return "    " + ctx.left.getText() + " " + visit(ctx.mathOp) + " " + ctx.right.getText() + ";\n\n";
    }

    /*** Operations and conditions ***/




    @Override
    public String visitConditionalOperation(TLParser.ConditionalOperationContext ctx) {
        visitChildren(ctx);

        if(ctx.conOpLT != null) {
            return "<";
        }
        if(ctx.conOpLE != null) {
            return "<=";
        }
        if(ctx.conOpGT != null) {
            return ">";
        }
        if(ctx.conOpGE != null) {
            return ">=";
        }
        if(ctx.conOpEQ != null) {
            return "==";
        }
        if(ctx.conOpNEQ != null) {
            return "!=";
        }

        return null;
    }

    @Override
    public String visitMathematicalOperation1(TLParser.MathematicalOperation1Context ctx) {


            if (ctx.mathOpADD != null) {
                return "+";
            }
            if (ctx.mathOpSUB != null) {
                return "-";
            }
            if (ctx.mathOpMUL != null) {
                return "*";
            }
            if (ctx.mathOpDIV != null) {
                return "/";
            }


        return null;
    }

    @Override
    public String visitMathematicalOperation2(TLParser.MathematicalOperation2Context ctx) {

        if(ctx.mathOpADD != null) {
            return "+=";
        }
        if(ctx.mathOpSUB != null) {
            return "-=";
        }
        if(ctx.mathOpMUL != null) {
            return "*=";
        }
        if(ctx.mathOpDIV != null) {
            return "/=";
        }

        return null;
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
