package TL.compiler.ErrorHandling;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

public interface TLErrorListener {
    void ThrowError(String errorMsg, ArrayList<Token> offendingTokens);

    void ThrowError(String errorMsg, Token offendingToken, Token... additionalOffendingTokens);

    void ThrowError(String errorMsg, ParseTree tree, Token... additionalOffendingTokens);
}
