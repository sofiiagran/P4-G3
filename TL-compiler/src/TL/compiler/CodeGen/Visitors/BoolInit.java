package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class BoolInit {

    String varName;
    String declaration;

    public String visitBoolInitialisation(TLParser.BooleanInitContext ctx, SymbolTable symbolTable){
        varName = ctx.var1ID.getText();
        Type type = Type.Boolean;
        Attributes attribute = new Attributes(varName, type);

        // checks if variable is declared
        if(symbolTable.isInScope(attribute)) {
            declaration = "    " + ctx.var1ID.getText() + " = "+ ctx.BOOL_LITERAL().getText() + ";";
        } else {
            // if it is not, add to symbol table and print initialisation with data type
            symbolTable.insertSymbol(attribute);
            declaration = "    bool " + ctx.var1ID.getText() + " = "+ ctx.BOOL_LITERAL().getText() + ";";
        }
        return declaration  + "\n\n";
    }
    public String getVarName(){
        return this.varName;
    }
    public String getDeclaration() {return this.declaration;}
}