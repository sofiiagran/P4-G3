package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class CollectionInitBool {

    public String visitCollectionBoolInit(TLParser.CollectionInitBoolContext ctx, SymbolTable symbolTable) {

        String instanceName = ctx.collectionInstance.getText();
        String field = ctx.field.getText();

        //throw error if instance name or field is not declared
        if(!(symbolTable.isInScope(new Attributes(instanceName, null)))){
            if(!(symbolTable.isInScope(new Attributes(field, null)))){
                throw new IllegalArgumentException("Variable: " + field + " is not declared.");
            }
            throw new IllegalArgumentException("Variable: " + instanceName + " is not declared.");
        }
        //if both is declared, initialisation is printed
        return "    " +  instanceName + "." + field + " = " + ctx.BOOL_LITERAL() + ";\n";
    }
}
