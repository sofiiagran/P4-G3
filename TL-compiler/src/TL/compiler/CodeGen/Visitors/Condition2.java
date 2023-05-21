package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class Condition2 {
    public String visitCondition2(TLParser.Con2Context ctx, SymbolTable symbolTable) {

        String varName;
        String condition = "";

        if (ctx.var().ID() != null) {
            varName = ctx.var().ID().getText();
            condition = checkVar(varName, symbolTable);
        } else if (ctx.var().dotVariable() != null){
            varName = ctx.var().dotVariable().getText();
            condition = checkVar(varName, symbolTable);
        }
        return condition;
    }

    public String checkVar(String varName, SymbolTable symbolTable){
        // checks if variable is declared
        if (symbolTable.isInScope(new Attributes(varName, null))) {
            // check that it is of type boolean
            if(symbolTable.retrieveSymbol(varName).getType() == Type.Boolean){
                return varName + " == true";
            } else {
                // throws error if not of type boolean
                throw new IllegalArgumentException("Variable: " + varName + " has to be of type truth value");
            }
        } else {
            // throws error if not declared
            throw new IllegalArgumentException("Variable: " + varName + " is not declared");
        }
    }
}
