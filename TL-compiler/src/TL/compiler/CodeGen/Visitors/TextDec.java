package TL.compiler.CodeGen.Visitors;


import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class TextDec {
    public String visitTextDec(TLParser.TextDeclContext ctx, SymbolTable symbolTable) {

        String varName = ctx.textID.getText();
        Type type = Type.Text;
        Attributes attribute = new Attributes(varName, type);

        // Check if it is already declared
        if (symbolTable.isInScope(attribute)) {
            //Throw error
            return "";
        } else {
            symbolTable.insertSymbol(attribute);
            return "    char " + varName + "[]" + ";" + "\n\n";
        }
    }

}
