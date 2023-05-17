package TL.compiler.CodeGen.Visitors;


import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class BoolDec {

    String declaration;
    String varName;

    public String visitBoolDec(TLParser.BoolDeclContext ctx, SymbolTable symbolTable){

            varName = ctx.boolID.getText();
            Type type = Type.Boolean;
            Attributes attribute = new Attributes(varName, type);

            // throw error if it is already declared and not a param
            if (symbolTable.isInScope(attribute) && symbolTable.retrieveSymbol(varName).getIsParam() == false) {
                throw new IllegalArgumentException("Duplicated declaration of variable: " + varName);
            } else {
                // if not, it is added to symbol table
                symbolTable.insertSymbol(attribute);
                declaration = "    char " + varName + "[]" + ";";
            }

            // if it is global scope, empty string is returned, since it is printed by globalDecListener
            if (symbolTable.getDepth() == 0) {
                return "";
            } else {
                return declaration + "\n";
            }
    }
    public String getVarName(){
        return this.varName;
    }
    public String getDeclaration() {return this.declaration;}
}
