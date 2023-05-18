package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class CollectionInitAll {

    public String visitCollectionAllInit(TLParser.CollectionInitAllContext ctx, SymbolTable symbolTable){
        String collectionName = ctx.collectionName.getText();
        String instanceName = ctx.instanceName.getText();
        String values = "";

        int valCount = 0;
        int commaCount = 0;
        int idCount = 1;

        //check if instance name is declared
        if(symbolTable.isInScope(new Attributes(instanceName, null))){
            throw new IllegalArgumentException("Variable name: " + instanceName + " is already in use" +
                    " and can therefore not be used to create instance of collection: " + collectionName);
        } else {
            symbolTable.insertSymbol(new Attributes(instanceName, Type.Collection));
        }

        //loops through children
        for(int i = 0; i < ctx.getChildCount(); i++) {
            //check if child is value
            if(ctx.getChild(i) == ctx.val(valCount)) {
                //check if it is a number value
                if (ctx.val(valCount).numberVal != null) {
                    // check if it is an integer
                    if (ctx.val(valCount).numberVal.NUMBER_VAL_INT() != null) {
                        values += ctx.val(valCount).numberVal.NUMBER_VAL_INT().getText()
                                + ".0";
                        // check if it is double
                    } else if (ctx.val(valCount).numberVal.NUMBER_VAL_DOUBLE() != null) {
                        values += ctx.val(valCount).numberVal.NUMBER_VAL_DOUBLE().getText();
                    }
                }
                // check if it is a text value
                else if (ctx.val(valCount).textVal != null) {
                    values += ctx.val(valCount).textVal.getText();
                }
                // check if it is a boolean value
                else if (ctx.val(valCount).boolVal != null) {
                    values += ctx.val(valCount).boolVal.getText();
                }
                valCount++;
            }
            // check if it is an ID (variable)
            else if(ctx.ID(idCount) != null){
                if(symbolTable.isInScope(new Attributes(ctx.ID(idCount).getText(), null))){
                    values += ctx.ID(idCount).getText();
                } else {
                    //throw error if variable is not declared
                    throw new IllegalArgumentException("Variable: " + ctx.ID(idCount).getText() + " is not declared.");
                }
                idCount++;

            // add ", " if child is a comma
            } else if (ctx.getChild(i) == ctx.COMMA(commaCount))  {
                values += ", ";
                commaCount++;
            }
        }
        return "    " + collectionName + " " + instanceName + " = {" + values + "};\n";
    }
}
