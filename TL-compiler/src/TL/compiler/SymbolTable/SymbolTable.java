package TL.compiler.SymbolTable;

import java.util.*;

public class SymbolTable {
    public Map<String, Attributes> hashMap = new LinkedHashMap<>();

    public ArrayList<Scope> scopes = new ArrayList<>();

    private int depth = -1;

    public SymbolTable() {
    }


    public void openScope(){
        depth++;

        this.scopes.add(new Scope());
    }

    public void closeScope(){



        this.scopes.remove(this.scopes.size()-1);

        depth--;
    }

    public Attributes retrieveSymbol(String name){
        return this.hashMap.get(name);
    }

    public Boolean isInScope(Attributes newAttribute) {
        Attributes attribute = this.retrieveSymbol(newAttribute.name);
        if(attribute != null  && attribute.depth == 0 ){
            return true;
        }
        if(attribute != null  && attribute.depth <= this.depth){
            return true;
        }
        return false;
    }

    public void insertSymbol(Attributes newAttribute){

        //Add to scope display
        newAttribute.depth = depth;
        this.scopes.get(this.scopes.size()-1).addAttribute(newAttribute);
        this.hashMap.put(newAttribute.name, newAttribute);


    }

    public int getDepth() {
        return this.depth;
    }
}
