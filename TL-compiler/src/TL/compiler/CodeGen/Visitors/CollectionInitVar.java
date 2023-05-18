package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class CollectionInitVar {

    public String visitCollectionVarInit(TLParser.CollectionInitVarContext ctx, SymbolTable symbolTable){
        String instanceName = ctx.collectionInstance.getText();
        String field = ctx.field.getText();
        String value = ctx.value.getText();

        //throw error if instance name, field or value is not declared
        if(!(symbolTable.isInScope(new Attributes(instanceName, null)))){
            if(!(symbolTable.isInScope(new Attributes(field, null)))){
                if(!(symbolTable.isInScope(new Attributes(value, null)))) {
                    throw new IllegalArgumentException("Variable: " + value + " is not declared.");
                }
                throw new IllegalArgumentException("Variable: " + field + " is not declared.");
            }
            throw new IllegalArgumentException("Variable: " + instanceName + " is not declared.");
        }
        //if both is declared, initialisation is printed
        return "    " + instanceName + "." + field + " = " + value + ";\n";
    }
}
