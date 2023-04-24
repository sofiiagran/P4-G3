package TL.compiler.TypeChecker;

import TL.compiler.ErrorHandling.TLErrorListener;
import TL.parser.TLBaseVisitor;
import TL.parser.TLParser;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.Arrays;

import static TL.parser.TLLexer.*;




public class TLTypeCheckerVisitor extends TLBaseVisitor{
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
        String leftType = VOCABULARY.getLiteralName(type1);
        String rightType = VOCABULARY.getLiteralName(type2);
        String errorMsg = String.format("Incompatible type: Type %s is incompatible with %s. %s",
                leftType, rightType, optionalText);

        ArrayList<Token> allOffendingTokens = new ArrayList<>(Arrays.asList(additionalOffendingTokens));
        allOffendingTokens.add(offendingToken);

        errorListener.ThrowError(errorMsg, allOffendingTokens);
    }



    @Override
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
            }
            default -> throw new IllegalArgumentException("Type not found by type-checker.");
        }


        return returnType;
    }
}
