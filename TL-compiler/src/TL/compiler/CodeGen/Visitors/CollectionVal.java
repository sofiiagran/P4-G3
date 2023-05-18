package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class CollectionVal {

    public String visitCollectionValue(TLParser.CollectionValContext ctx, SymbolTable symbolTable){
        String varName = ctx.instanceName.getText();
        String field = ctx.field.getText();

        // throw error if variable does not exist or is not a collection
        if(symbolTable.isInScope(new Attributes(varName, null))) {
            if (symbolTable.retrieveSymbol(varName).getType() != Type.Collection){
                throw new IllegalArgumentException(
                        "Cannot get index from variable: " + varName + " since it is not a collection");
            }
            throw new IllegalArgumentException("Cannot get value from variable: " + varName + " since it is not declared");
        }
        if(!(symbolTable.isInScope(new Attributes(field, null)))){
            throw new IllegalArgumentException("Cannot get value from variable: " + varName +
                    " since field: " + field + " is not declared.");
        }

        return "    " + varName + "." + field;
    }

}
