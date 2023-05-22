package TL.compiler.SymbolTable;

import java.util.Map;
import java.util.Objects;

public class Attributes {
    String name;
    Type type;
    Boolean isParam = false;
    int depth;


    public Attributes(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Type getType() {
        return type;
    }
    public Type setType(Type t) {
        return this.type = t;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, type, depth);
    }

    public int getDepth(){
        return this.depth;
    }

    public void setIsParam(Boolean truthvalue){
        this.isParam = truthvalue;
    }
    public Boolean getIsParam(){
        return this.isParam;
    }



}
