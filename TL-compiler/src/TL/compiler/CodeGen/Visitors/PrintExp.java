package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

import java.util.ArrayList;

public class PrintExp {

    public String visitPrintExpr(TLParser.PrintExpContext ctx, SymbolTable symbolTable){
        return "    printf(" + printBody(ctx, symbolTable) + ");" + "\n";
    }

    public String printBody(TLParser.PrintExpContext ctx, SymbolTable symbolTable){

        int numberCount = 0;
        int textCount = 0;
        int idCount = 0;
        int addCount = 0;
        int dotCount = 0;

        ArrayList<String> variableNames = new ArrayList<>();
        String printVarNames = "";
        String val = " \"";


        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) == ctx.numberValue(numberCount)) {
                // checks if number is integer, if true, then add .0 and transform to double
                if (ctx.numberValue(numberCount).NUMBER_VAL_INT() != null) {
                    val += ctx.getChild(i).getText() + ".0";
                }
                if (ctx.numberValue(numberCount).NUMBER_VAL_DOUBLE() != null) {
                    val += ctx.getChild(i).getText();
                }
                numberCount++;
            }
            if (ctx.getChild(i) == ctx.TEXT_VAL(textCount)) {
                // remove "" from string, so they can be attached to each other
                String newString = ctx.getChild(i).getText();
                val += newString.replace("\"", "");
                textCount++;
            }
            //checks if child is a variable (ID)
            else if (ctx.getChild(i) == ctx.ID(idCount)) {
                if (symbolTable.isInScope(new Attributes(ctx.ID(idCount).getText(), null))) {
                    // print different base on type of the variable + adds variable to an array
                    if (symbolTable.retrieveSymbol(ctx.ID(idCount).getText()).getType() == Type.Number) {
                        val += "%lf";
                        variableNames.add(ctx.ID(idCount).getText());
                        idCount++;
                    }
                    else if (symbolTable.retrieveSymbol(ctx.ID(idCount).getText()).getType() == Type.Text) {
                        val += "%s";
                        variableNames.add(ctx.ID(idCount).getText());
                        idCount++;
                    }
                    else if (symbolTable.retrieveSymbol(ctx.ID(idCount).getText()).getType() == Type.Boolean) {
                        val += "%d";
                        variableNames.add(ctx.ID(idCount).getText());
                        idCount++;
                    }
                } else {
                    throw new IllegalArgumentException("Error: missing variable declaration of variable: " + ctx.ID(idCount).getText());
                }
            }
            // if child is +, change it to space
            if (ctx.getChild(i) == ctx.ADD(addCount)) {
                val += " ";
                addCount++;
            }
        }
        for(int i = 0; i < variableNames.size(); i++){
            printVarNames += ", " + variableNames.get(i);
        }
        //print the result string with "" added to start and end, plus variable names printed afterwards
        return val + "\" " + printVarNames;
    }
}
