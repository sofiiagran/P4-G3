package TL.compiler.SymbolTable;

import java.util.ArrayList;

public class Scope {
    public final ArrayList<Attributes> attributes = new ArrayList<>();

    public Scope() {
    }
    public void addAttribute(Attributes attribute){
        this.attributes.add(attribute);
    }

}

