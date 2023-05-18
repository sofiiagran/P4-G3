package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class IndexVal {

    public String visitIndexValue(TLParser.IndexValContext ctx, SymbolTable symbolTable){

        String varName = ctx.ID().getText();

        // throw error if variable does not exist or is not a list
        if(symbolTable.isInScope(new Attributes(varName, null))) {
            if (symbolTable.retrieveSymbol(varName).getType() != Type.NumberList
                    && symbolTable.retrieveSymbol(varName).getType() != Type.TextList){
                throw new IllegalArgumentException(
                        "Cannot get index from variable: " + varName + " since it is not a list");
            }
            throw new IllegalArgumentException("Cannot get index from variable: " + varName + " since it is not declared");
        }
        return varName + "[" + ctx.NUMBER_VAL_INT().getText() + "]";
    }
}
