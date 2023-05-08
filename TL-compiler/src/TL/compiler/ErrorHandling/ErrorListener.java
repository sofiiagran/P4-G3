package TL.compiler.ErrorHandling;

import TL.parser.TLLexer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ErrorListener extends BaseErrorListener implements IErrorListener {


    @Override
    public void ThrowError(String errorMsg, ArrayList<Token> offendingTokens) {

    }

    @Override
    public void ThrowError(String errorMsg, Token offendingToken, Token... additionalOffendingTokens) {

    }

    @Override
    public void ThrowError(String errorMsg, ParseTree tree, Token... additionalOffendingTokens) {

    }
}

