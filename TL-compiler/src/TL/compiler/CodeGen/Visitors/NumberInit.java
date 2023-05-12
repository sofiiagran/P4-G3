package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class NumberInit {
    String varName;
    String declaration;


    public String visitNumberInitialisation(TLParser.NumberInitContext ctx, SymbolTable symbolTable) {
        varName  = ctx.var1ID.getText();
        Type type = Type.Number;
        Attributes attribute = new Attributes(varName, type);
        // checks if variable is declared
        if(symbolTable.isInScope(attribute)) {
            declaration = "    "  + varName + " = " + ctx.NUMBER_VAL() + ";";
        } else {
            // if it is not, add to symbol table and print initialisation with data type
            symbolTable.insertSymbol(attribute);
            declaration = "    double " + varName + " = " + ctx.NUMBER_VAL() + ";";
        }
        return declaration  + "\n\n";
    }
    public String getVarName(){
        return this.varName;
    }
    public String getDeclaration() {return this.declaration;}

}
