package TL.compiler.TypeChecker;

<<<<<<< Updated upstream
import TL.compiler.ErrorHandling.TLErrorListener;
import TL.parser.TLBaseVisitor;
import TL.parser.TLParser;

import org.antlr.v4.runtime.Token;
=======
import TL.compiler.ErrorHandling.IErrorListener;
import TL.compiler.SymbolTable.BaseScope;
import TL.compiler.SymbolTable.IScope;
import TL.parser.TLBaseVisitor;
import TL.parser.TLParser;

import com.sun.source.tree.Scope;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
>>>>>>> Stashed changes

import java.util.ArrayList;
import java.util.Arrays;

import static TL.parser.TLLexer.*;




public class TLTypeCheckerVisitor extends TLBaseVisitor{
<<<<<<< Updated upstream
    TLErrorListener errorListener;
    /*Scope globalScope;
    ParseTreeProperty<Scope> scopes;

    public TLTypeCheckerVisitor(Scope globalScope, ParseTreeProperty<Scope> scopes, TLErrorListener errorListener) {
        this.globalScope = globalScope;
        this.scopes = scopes;
        this.errorListener = errorListener;
    }
       */

    private void throwTypeError(Integer type1, Integer type2, String optionalText,
                                Token offendingToken, Token... additionalOffendingTokens) {
=======
    IErrorListener errorListener;


    public TLTypeCheckerVisitor(IErrorListener errorListener) {
        this.errorListener = errorListener;

    }


    private void throwTypeError(Integer type1, Integer type2, String optionalText) {
>>>>>>> Stashed changes
        String leftType = VOCABULARY.getLiteralName(type1);
        String rightType = VOCABULARY.getLiteralName(type2);
        String errorMsg = String.format("Incompatible type: Type %s is incompatible with %s. %s",
                leftType, rightType, optionalText);

<<<<<<< Updated upstream
        ArrayList<Token> allOffendingTokens = new ArrayList<>(Arrays.asList(additionalOffendingTokens));
        allOffendingTokens.add(offendingToken);

        errorListener.ThrowError(errorMsg, allOffendingTokens);
=======
        /**ArrayList<Token> allOffendingTokens = new ArrayList<>(Arrays.asList(additionalOffendingTokens));
        allOffendingTokens.add(offendingToken);

        errorListener.ThrowError(errorMsg, allOffendingTokens); **/
>>>>>>> Stashed changes
    }



    @Override
<<<<<<< Updated upstream
    public Integer visitMathExp(TLParser.MathExpContext ctx) {
        int returnType;

        int left = ctx.left.getAltNumber();
        int right = ctx.right.getAltNumber();
        Token op = (Token) ctx.op;

        String errorText = "On operation " + ctx.op.getText() + ". Must be number type";
        switch (ctx.op.getText()) {
            case "ADD", "+", "SUB", "-", "MUL", "*", "DIV", "/" -> {
                if (left != NUMBER || right != NUMBER)
                    throwTypeError(left, right, errorText, op);
                returnType = NUMBER;
=======
   public String visitMathExp1(TLParser.MathExp1Context ctx) {

        String type = null;
        String op = null;

        switch (ctx.mathOp.getText()) {
            case "+" -> {
                if (ctx.left.numberVal != null || ctx.right.numberVal != null) {
                    if (ctx.left.textVal != null || ctx.right.textVal != null) {
                        //throwTypeError(left, right, errorText);
                        op = ctx.mathOp.getText();
                        type = "either string or integer";
                    }
                }
            }
            case "-",  "*", "/" -> {
                if (ctx.left.numberVal != null || ctx.right.numberVal != null) {
                        //throwTypeError(left, right, errorText);
                    op = ctx.mathOp.getText();
                    type = "integer";
                }

>>>>>>> Stashed changes
            }
            default -> throw new IllegalArgumentException("Type not found by type-checker.");
        }

<<<<<<< Updated upstream

        return returnType;
=======
        String errorText = "On operation " + op + ". All values must be of the same type: " + type;

        //System.out.println(errorText);

        return errorText;
    }

    @Override
    public String visitMathExp2(TLParser.MathExp2Context ctx) {


        String type = null;
        String op = null;

        switch (ctx.mathOp.getText()) {
            case "+=" ->  {
                if (ctx.left.numberVal != null || ctx.right.numberVal != null) {
                    if (ctx.left.textVal != null || ctx.right.textVal != null) {
                        //throwTypeError(left, right, errorText);
                        op = ctx.mathOp.getText();
                        type = "either string or integer";
                    }
                }
            }
            case "-=", "*=", "/=" -> {
                if (ctx.left.numberVal != null || ctx.right.numberVal != null) {
                    //   throwTypeError(left, right, errorText, op);
                    op = ctx.mathOp.getText();
                    type = "integer";

                }
            }
            default -> throw new IllegalArgumentException("Type not found by type-checker.");
        }

        String errorText = "On operation " + op + ". Both values must be of the same type: " + type;

        //System.out.println(errorText);

        return errorText;
>>>>>>> Stashed changes
    }
}
