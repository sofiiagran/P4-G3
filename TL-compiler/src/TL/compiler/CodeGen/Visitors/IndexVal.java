package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class IndexVal {

    public String visitIndexValue(TLParser.DotVariableContext ctx, SymbolTable symbolTable){

        String varName = ctx.listID.getText();
        String index = ctx.NUMBER_VAL_INT().getText();

        setIndexVar(varName, index, symbolTable);


        // return the index value with C syntax
        return varName + "[" + index + "]";
    }

    public void setIndexVar(String varName, String index, SymbolTable symbolTable){

        String indexVar = varName + "[" + index + "]";
        // check if variable is declared
        if(symbolTable.isInScope(new Attributes(varName, null))) {
            // if variable is of type number list, then the index value is added as type number
            if (symbolTable.retrieveSymbol(varName).getType() != Type.NumberList){
                symbolTable.insertSymbol(new Attributes(indexVar, Type.Number));
            }
            // if variable is of type text list, then the index value is added as type text
            else if(symbolTable.retrieveSymbol(varName).getType() != Type.TextList){
                symbolTable.insertSymbol(new Attributes(indexVar, Type.Text));
            } else {
                // throw error if variable is not of type number list or text list
                throw new IllegalArgumentException("Cannot get index from variable: " + varName + " since it is not a list");
            }
        } else {
            // throw error if variable is not declared
            throw new IllegalArgumentException(
                    "Cannot get index from variable: " + varName + " since it is not declared");
        }
    }
}
