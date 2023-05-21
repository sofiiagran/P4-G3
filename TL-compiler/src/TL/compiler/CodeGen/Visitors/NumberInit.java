package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class NumberInit {
    String varName;
    String init;

    public Boolean declared = false;


    public String visitNumberInitialisation(TLParser.NumberInitContext ctx, SymbolTable symbolTable) {
        varName  = ctx.var1ID.getText();
        Type type = Type.Number;
        Attributes attribute = new Attributes(varName, type);
        // checks if variable is declared and of right type
        if(symbolTable.isInScope(attribute)) {
            if(symbolTable.retrieveSymbol(varName).getType() == Type.Number) {
                init = "    "  + varName + " = " + ctx.numberVal.getText() + ";";
            } else {
                throw new IllegalArgumentException("Error: variable is already declared with at different datatype");
            }
        } else {
            // if it is not, add to symbol table and print initialisation with data type
            symbolTable.insertSymbol(attribute);
            if(ctx.numberVal.NUMBER_VAL_INT() != null) {
                //adds .0 if integer
                init = "    double " + varName + " = " + ctx.numberVal.getText() + ".0 ;";
            }
            else if(ctx.numberVal.NUMBER_VAL_DOUBLE() != null){
                init = "    double " + varName + " = " + ctx.numberVal.getText() + ";";
            }
        }
        // if it declared in global scope, it is not printed, since it is printed by globalDecListener
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


}
