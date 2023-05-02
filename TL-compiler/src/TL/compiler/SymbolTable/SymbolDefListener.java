package TL.compiler.SymbolTable;

import TL.compiler.CodeGenerator;
import TL.compiler.SymbolTable.BaseScope;
import TL.compiler.SymbolTable.IScope;
import TL.compiler.SymbolTable.Symbol;
import TL.parser.TLBaseListener;
import TL.parser.TLParser;
import com.sun.source.tree.Scope;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.*;

public class SymbolDefListener extends TLBaseListener {



    public ParseTreeProperty<IScope> scopes = new ParseTreeProperty<>();
    public BaseScope globalscope = new BaseScope();
    public IScope currentScope;




    @Override public void enterStartBlock(TLParser.StartBlockContext ctx)
    {

        currentScope = globalscope;

    }

    public void enterFuncDec(TLParser.FuncDecContext ctx) {
        String funcName = ctx.funcID.getText();
        String type = "function";
        BaseScope funcScope = new BaseScope(currentScope, funcName);

        Symbol newSymbol = new Symbol(funcName, type, funcScope);
        currentScope.defineSymbol(newSymbol);

        currentScope = funcScope;



    }
    @Override
    public void exitFuncDec(TLParser.FuncDecContext ctx) {
        currentScope = currentScope.getEnclosedScope();
    }



    @Override
    public void enterNumberDec(TLParser.NumberDecContext ctx) {
        String varName = ctx.ID().getText();
        String type = "number";
        BaseScope decScope = new BaseScope(currentScope, varName);

        Symbol newSymbol = new Symbol(varName, type, decScope);
        currentScope.defineSymbol(newSymbol);


        currentScope = decScope;
    }
    @Override
    public void exitNumberDec(TLParser.NumberDecContext ctx) {
        currentScope = currentScope.getEnclosedScope();
    }

    @Override
    public void enterTextDec(TLParser.TextDecContext ctx) {
        String varName = ctx.ID().getText();
        String type = "text";
        BaseScope decScope = new BaseScope(currentScope, varName);

        Symbol newSymbol = new Symbol(varName, type, decScope);
        currentScope.defineSymbol(newSymbol);


        currentScope = decScope;
    }
    @Override
    public void exitTextDec(TLParser.TextDecContext ctx) {
        currentScope = currentScope.getEnclosedScope();
    }


    @Override
    public void enterBoolDec(TLParser.BoolDecContext ctx) {
        String varName = ctx.ID().getText();
        String type = "bool";
        BaseScope decScope = new BaseScope(currentScope, varName);

        Symbol newSymbol = new Symbol(varName, type, decScope);
        currentScope.defineSymbol(newSymbol);

        currentScope = decScope;
    }
    @Override
    public void exitBoolDec(TLParser.BoolDecContext ctx) {
        currentScope = currentScope.getEnclosedScope();
    }



    public Boolean checkVar (String name, IScope scope) {
        if (scope.getSymbol(name) != null) {
            return true;
        }
        return false;
    }
}
