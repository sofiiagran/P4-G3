package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class TextInit {
    String varName;
    String init;
    Boolean declared = false;
    public String visitTextInitialisation (TLParser.TextInitContext ctx, SymbolTable symbolTable){

        varName = ctx.var1ID.getText();
        Type type = Type.Text;
        Attributes attribute = new Attributes(varName, type);

        // checks if variable is declared
        if(symbolTable.isInScope(attribute)) {
            if(symbolTable.retrieveSymbol(varName).getType() == Type.Text) {
                init = "    "  + ctx.var1ID.getText() + " = " + ctx.TEXT_VAL() + ";";
                declared = true;
            } else {
                throw new IllegalArgumentException("Error: variable is already declared with at different datatype");
            }
        } else {
            // if it is not, add to symbol table and print initialisation with data type
            symbolTable.insertSymbol(attribute);
            init = "    "  + "char " + ctx.var1ID.getText() + "[]" + " = " + ctx.TEXT_VAL() + ";";
            declared = false;
        }

        // if it is global scope, empty string is returned, since declaration is printed by globalDecListener
        if (symbolTable.getDepth() == 0) {
            return "";
        } else {
            return init + "\n";
        }
    }
    public String getVarName(){
        return this.varName;
    }
    public String getInit() {return this.init;}
    public Boolean isDeclared() {
        return this.declared;
    }
}
