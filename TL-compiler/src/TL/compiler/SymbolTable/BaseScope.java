package TL.compiler.SymbolTable;

import java.util.*;

public class BaseScope implements IScope {
    private IScope enclosingScope;
    public Map<String, Symbol> symbols = new HashMap<String, Symbol>();

    public String name;

    public BaseScope() {

    }

    public BaseScope(IScope enclosingScope, String name)
    {

        this.name = name;
        setEnclosedScope(enclosingScope);

    }

    public void defineSymbol(Symbol symbol) {
        if (symbols.containsKey(symbol.getName())) {
            System.out.println("DUP SYMBOL " + symbol.getName());
        }
        symbols.put(symbol.getName(), symbol);
    }

    public Symbol getSymbol(String name) {
        Symbol sym = symbols.get(name);
        if (sym != null) {
            return sym;
        }
        if (enclosingScope != null) {
            return enclosingScope.getSymbol(name);
        }
        return null;
    }

    public void setEnclosedScope(IScope scope) {
        this.enclosingScope = scope;
    }

    public IScope getEnclosedScope() {
        return this.enclosingScope;
    }
}