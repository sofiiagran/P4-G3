package TL.compiler.SymbolTable;

import java.util.*;

public class SymbolTable {
    public final Map<String, Attributes> map = new LinkedHashMap<>();

    public final Map<String, Attributes> hashMap = Collections.synchronizedMap(map);



    public ArrayList<Scope> scopes = new ArrayList<>();

    private int depth = -1;

    public SymbolTable() {
    }


    public void openScope(){
        depth++;

        this.scopes.add(new Scope());
    }

    public void closeScope(){

        for (Attributes attribute: this.scopes.get(this.scopes.size()-1).attributes) {
            this.hashMap.remove(attribute.name);
        }

        this.scopes.remove(this.scopes.size()-1);
        depth--;
    }

    public Boolean containsSymbol(String name) {
        System.out.println(hashMap.get(name));
        if(hashMap.containsKey(name)){
            return true;
        } else {
            return false;
        }
    }
    public Attributes retrieveSymbol(String name){
        return this.hashMap.get(name);
    }

    public Boolean isInScope(Attributes newAttribute) {
        Attributes attribute = this.retrieveSymbol(newAttribute.name);
        if(attribute != null  && attribute.depth == 0 ){
            return true;
        }
        if(attribute != null  && attribute.depth <= depth){
            return true;
        }
        return false;
    }

    public void insertSymbol(Attributes newAttribute){


        if(isInScope(newAttribute)) {
            throw new RuntimeException("Duplicate definition of: " + newAttribute.name);
        }

        //Add to scope display
        newAttribute.depth = depth;
        this.scopes.get(this.scopes.size()-1).addAttribute(newAttribute);
        this.hashMap.put(newAttribute.name, newAttribute);


    }

    public boolean isDeclaredLocally(String name){
        for (Attributes symbol: this.scopes.get(this.scopes.size()-1).attributes) {
            if (name.equals(symbol.name)){
                return true;
            }
        }
        return false;
    }



}
