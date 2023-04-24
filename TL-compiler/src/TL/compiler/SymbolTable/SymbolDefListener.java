package TL.compiler.SymbolTable;

import TL.compiler.CodeGenerator;
import TL.parser.TLBaseListener;
import TL.parser.TLParser;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import java.util.List;
import java.util.ArrayList;

public class SymbolDefListener extends TLBaseListener {

    public ParseTreeProperty<IScope> scopes = new ParseTreeProperty<>();
    public BaseScope globalscope = new BaseScope();
    IScope currentScope;
    List<Symbol> variables = new ArrayList<>();



    @Override public void enterStartBlock(TLParser.StartBlockContext ctx)
    {

        currentScope = globalscope;

    }

    public void enterFuncDec(TLParser.FuncDecContext ctx) {
        String funcName = ctx.funcName().getText();
        String type = "function";
        BaseScope funcScope = new BaseScope(currentScope, funcName);
        currentScope.defineSymbol(new Symbol(funcName, type, funcScope));
        currentScope = funcScope;
    }
    @Override
    public void exitFuncDec(TLParser.FuncDecContext ctx) {
        currentScope = currentScope.getEnclosedScope();
    }


    public void enterDeclaration(TLParser.DeclarationContext ctx) {
        String varName = ctx.var().getText();
        String type = "declaration";
        BaseScope decScope = new BaseScope(currentScope, varName);
        currentScope.defineSymbol(new Symbol(varName, type, decScope));
        currentScope = decScope;

        System.out.println("test test test test");
    }

    @Override
    public void exitDeclaration(TLParser.DeclarationContext ctx) {
        currentScope = currentScope.getEnclosedScope();
    }
}
