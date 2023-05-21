package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class CollectionInitNumber {
    String init;
    public String visitCollectionNumberInit(TLParser.CollectionInitNumberContext ctx, SymbolTable symbolTable){
        String instanceName = ctx.collectionInstance.getText();
        String field = ctx.field.getText();
        String number = "";

        //throw error if instance name or field is not declared
        if(!(symbolTable.isInScope(new Attributes(instanceName, null)))){
            if(!(symbolTable.isInScope(new Attributes(field, null)))){
                throw new IllegalArgumentException("Variable: " + field + " is not declared.");
            }
            throw new IllegalArgumentException("Variable: " + instanceName + " is not declared.");
        }
        // check if it is an integer (then add .0)
        if(ctx.numberValue().NUMBER_VAL_INT() != null) {
            number = ctx.numberValue().NUMBER_VAL_INT().getText() + ".0";
        } // check if it is double
        else if(ctx.numberValue().NUMBER_VAL_DOUBLE() != null) {
            number = ctx.numberValue().NUMBER_VAL_DOUBLE().getText();
        }

        //if both is declared, initialisation is printed
        init = "    " + instanceName + "." + field + " = " + number + ";\n";
        return init + "\n";
    }
    public String getInit() {return this.init;}
}
