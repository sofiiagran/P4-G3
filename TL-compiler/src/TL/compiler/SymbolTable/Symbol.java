package TL.compiler.SymbolTable;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Symbol {

    public String name;
    public String type;
    public IScope scope;



    public Symbol(String name, String type, IScope scope) {
        this.name = name;
        this.type = type;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

}
