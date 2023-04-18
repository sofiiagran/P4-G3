package TL.compiler.SymbolTable;

public interface IScope {

    IScope getEnclosedScope();

    void setEnclosedScope(IScope scope);

    void defineSymbol(Symbol symbol);

    Symbol getSymbol(String name);
}