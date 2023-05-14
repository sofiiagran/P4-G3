package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class NumberInit {
    String varName;
    String declaration;

    public Boolean declared = false;


    public String visitNumberInitialisation(TLParser.NumberInitContext ctx, SymbolTable symbolTable) {
        varName  = ctx.var1ID.getText();
        Type type = Type.Number;
        Attributes attribute = new Attributes(varName, type);
        // checks if variable is declared and of right type
        if(symbolTable.isInScope(attribute)) {
            if(symbolTable.retrieveSymbol(varName).getType() == Type.Number) {
                declaration = "    "  + varName + " = " + ctx.NUMBER_VAL() + ";";
                declared = true;
            } else {
                System.err.println("Error: variable is already declared with at different datatype");
                declaration = "";
                declared = true;
            }
        } else {
            // if it is not, add to symbol table and print initialisation with data type
            symbolTable.insertSymbol(attribute);
            declaration = "    double " + varName + " = " + ctx.NUMBER_VAL() + ";";
            declared = false;
        }
        if (symbolTable.getDepth() == 0) {
            return "";
        } else {
            return declaration + "\n\n";
        }
    }
    public String getVarName(){
        return this.varName;
    }
    public String getDeclaration() {return this.declaration;}

    public Boolean isDeclared() {
        return this.declared;
    }
}
