package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class NumberDec {

    String varName;
    String declaration;

    public String visitNumberDec(TLParser.NumberDeclContext ctx, SymbolTable symbolTable) {
        varName = ctx.numberID.getText();

        Type type = Type.Number;
        Attributes attribute = new Attributes(varName, type);

        // Check if it is already declared
        if(symbolTable.isInScope(attribute)) {
            //Throw error
            System.err.println("Duplicated declaration of variable: " + varName);
            declaration = "";
        } else {
            symbolTable.insertSymbol(attribute);
            declaration = "    int " + varName + ";";
        }
        return declaration + "\n\n";
    }

    public String getVarName(){
        return this.varName;
    }
    public String getDeclaration() {return this.declaration;}
}
