package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class NumberListInit {
    String varName;
    String init;
    String array;
    String initialisation;


    public String visitNumberListInitialisation(TLParser.NumberListInitContext ctx, SymbolTable symbolTable) {

        array = "";

        int idCount = 1;
        int valCount = 0;
        int commaCount = 0;

        varName  = ctx.assignID.getText();

        Attributes attribute = new Attributes(varName, Type.NumberList);
        // checks if variable is declared and of right type
        if(symbolTable.isInScope(attribute)) {
            if(symbolTable.retrieveSymbol(varName).getType() == Type.Number) {
                init = "    "  + varName + " = ";
            } else {
                throw new IllegalArgumentException("Error: variable is already declared with at different datatype");
            }
        } else {
            // if it is not, add to symbol table and print initialisation with data type
            symbolTable.insertSymbol(attribute);
            init = "    double " + varName + "[]";
        }
        for(int i = 0; i < ctx.getChildCount(); i++){
            if(ctx.getChild(i) == ctx.ID(idCount)){
                if(symbolTable.isInScope(new Attributes(ctx.ID(idCount).getText(), null))) {
                    //throw error if it is not of type number
                    if(symbolTable.retrieveSymbol(ctx.ID(idCount).getText()).getType() != Type.Number){
                        throw new IllegalArgumentException(
                                "Error: " + ctx.ID(idCount).getText() + " is not of type number.\n"
                                + "All variable must be of type number in a number list");
                    }
                } else {
                    //throw error if variable is not declared
                    throw new IllegalArgumentException("Error: undeclared variable: " + ctx.ID(idCount).getText()
                    + " is used in number list initialisation");
                }
                array += ctx.getChild(i).getText();
                idCount++;
            }
            // add .0 if number is integer
            else if(ctx.getChild(i) == ctx.numberValue(valCount)){
                if(ctx.numberValue(valCount).NUMBER_VAL_INT() != null) {
                    array += ctx.getChild(i).getText() + ".0";
                } else {
                    array += ctx.getChild(i).getText();
                }
                valCount++;

            // add ", " if child is a comma
            } else if (ctx.getChild(i) == ctx.COMMA(commaCount))  {
                array += ", ";
                commaCount++;
            }
        }

        initialisation = init + " = {" + array + "};";


        // if it initialised in global scope, it is not printed, since it is printed by globalDecListener
        if (symbolTable.getDepth() == 0) {
            return "";
        } else {
            return initialisation + "\n";
        }
    }
    public String getInitialisation(){
        return this.initialisation;
    }
}
