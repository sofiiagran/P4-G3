package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class NumberDec {

    public String varName;

    public String visitNumberDec(TLParser.NumberDeclContext ctx, SymbolTable symbolTable) {
        varName = ctx.numberID.getText();
        Type type = Type.Number;
        Attributes attribute = new Attributes(varName, type);

        // Check if it is already declared
        if(symbolTable.isInScope(attribute)) {
            //Throw error
            return "";
        } else {
            symbolTable.insertSymbol(attribute);
            return "    int " + varName + ";" + "\n\n";
        }
    }
}
