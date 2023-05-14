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

            // Check if it is already declared
            if (symbolTable.isInScope(attribute) && symbolTable.retrieveSymbol(varName).getIsParam() == false) {
                //Throw error
                System.err.println("Duplicated declaration of variable: " + varName);
                declaration = "";
            } else {
                symbolTable.insertSymbol(attribute);
                declaration = "    char " + varName + "[]" + ";";
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
}
