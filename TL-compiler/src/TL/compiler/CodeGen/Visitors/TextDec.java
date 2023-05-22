package TL.compiler.CodeGen.Visitors;


import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class TextDec {

    String varName;
    String declaration;
    public String visitTextDec(TLParser.TextDeclContext ctx, SymbolTable symbolTable) {
            varName = ctx.textID.getText();
            Type type = Type.Text;
            Attributes attribute = new Attributes(varName, type);

            // throw error if already declared and not a param
            if (symbolTable.isInScope(attribute) && symbolTable.retrieveSymbol(varName).getIsParam() == false) {
                throw new IllegalArgumentException("Duplicated declaration of variable: " + varName);
            } else {
                //if not, it is added to symbol table
                symbolTable.insertSymbol(attribute);
                declaration = "    char " + varName + "[100];";
            }

            // if it is global scope, empty string is returned, since declaration is printed by globalDecListener
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
