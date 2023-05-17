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

            // throws error if it is already declared and that it is not a param
            if (symbolTable.isInScope(attribute) && symbolTable.retrieveSymbol(varName).getIsParam() == false) {
                throw new IllegalArgumentException("Duplicated declaration of variable: " + varName);
            } else {
                //if not, it is added to symbol table
                symbolTable.insertSymbol(attribute);
                declaration = "    double " + varName + ";";
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

