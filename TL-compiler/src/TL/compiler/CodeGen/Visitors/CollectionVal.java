package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class CollectionVal {

    public String visitCollectionValue(TLParser.DotVariableContext ctx, SymbolTable symbolTable){
        String varName = ctx.instanceName.getText();
        String field = ctx.field.getText();
        String collectionVal = varName + "." + field;

        // throw error if variable does not exist or is not a collection
        if(symbolTable.isInScope(new Attributes(varName, null))) {
            if (symbolTable.retrieveSymbol(varName).getType() != Type.Collection){
                throw new IllegalArgumentException(
                        "Cannot get index from variable: " + varName + " since it is not a collection");
            }
        } else {
            throw new IllegalArgumentException("Cannot get value from variable: " + varName + " since it is not declared");
        }
        if(symbolTable.isInScope(new Attributes(field, null))) {
            // if field is type number, new variable "collection value" is assigned as type number
            if(symbolTable.retrieveSymbol(field).getType() == Type.Number){
                symbolTable.insertSymbol(new Attributes(collectionVal, Type.Number));
            } // if field is type text, new variable "collection value" is assigned as type text
            else if (symbolTable.retrieveSymbol(field).getType() == Type.Text){
                symbolTable.insertSymbol(new Attributes(collectionVal, Type.Text));
            } // if field is type boolean, new variable "collection value" is assigned as type boolean
            else if(symbolTable.retrieveSymbol(field).getType() == Type.Boolean){
                symbolTable.insertSymbol(new Attributes(collectionVal, Type.Boolean));
            } else {
                // throws error if field is not declared
                throw new IllegalArgumentException("Cannot recognize datatype of variable: " + field +
                        " in expression: " + collectionVal);
            }
        } else {
            // throws error if field is not declared
            throw new IllegalArgumentException("Cannot get value from variable: " + varName +
                    " since field: " + field + " is not declared.");
        }

        // return the collection value
        return "    " + collectionVal;
    }

}
