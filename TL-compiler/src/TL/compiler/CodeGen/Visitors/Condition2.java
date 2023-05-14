package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class Condition2 {
    public String visitCondition2(TLParser.Con2Context ctx, SymbolTable symbolTable){
        String varName = ctx.ID().getText();

        // checks if variable is declared
        if(symbolTable.isInScope(new Attributes(varName, null))) {
            return "(" + varName + ")";
        } else {
            // throws error if not declared
            System.err.println("Variable: " + varName + " is not declared");
            return null;
        }
    }
}
