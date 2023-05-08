package TL.compiler.SymbolTable;

import java.util.Map;
import java.util.Objects;

public class Attributes {
    String name;
    Type type;
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
}
