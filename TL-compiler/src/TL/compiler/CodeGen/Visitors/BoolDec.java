package TL.compiler.CodeGen.Visitors;


import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class BoolDec {
    public String visitBoolDec(TLParser.BoolDeclContext ctx, SymbolTable symbolTable){

        String varName = ctx.boolID.getText();
        Type type = Type.Boolean;
        Attributes attribute = new Attributes(varName, type);

        // check if variable is already declared
        if (symbolTable.isInScope(attribute)) {
            // throw error if it is already declared
            return "";
        } else {
            // if it is not declared, add to symbol table and declare it
            symbolTable.insertSymbol(attribute);
            return "    bool " + varName + ";" + "\n\n";
        }
    }
}
