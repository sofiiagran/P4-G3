package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class NumberInit {

    public String visitNumberInitialisation(TLParser.NumberInitContext ctx, SymbolTable symbolTable) {
        String varName = ctx.var1ID.getText();
        Type type = Type.Number;
        Attributes attribute = new Attributes(varName, type);

        // checks if variable is declared
        if(symbolTable.isInScope(attribute)) {
            return "    "  + varName + " = " + ctx.NUMBER_VAL() + ";" + "\n\n";
        } else {
            // if it is not, add to symbol table and print initialisation with data type
            symbolTable.insertSymbol(attribute);
            return "    double " + varName + " = " + ctx.NUMBER_VAL() + ";" + "\n\n";
        }
    }

}
