package TL.compiler.CodeGen.Visitors;

import TL.compiler.CodeGen.TypeChecker.TypeCheckerPrintBody;
import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

import java.util.ArrayList;

public class PrintExp {

    TypeCheckerPrintBody typeChecker = new TypeCheckerPrintBody();

    public String visitPrintExpr(TLParser.PrintExpContext ctx, SymbolTable symbolTable){
        return "    printf(" + printBody(ctx, symbolTable) + ");" + "\n";
    }

    public String printBody(TLParser.PrintExpContext ctx, SymbolTable symbolTable){

        int numberCount = 0;
        int textCount = 0;
        int addCount = 0;
        int varCount = 0;

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
            //checks if child is a variable
            else if (ctx.getChild(i) == ctx.var(varCount)){
                // check if it is ID
                if(ctx.var(varCount).ID() != null){
                    String varName = ctx.var(varCount).ID().getText();
                    // calls function that check type and translate it to C
                    val += typeChecker.checkType(varName, symbolTable);
                    variableNames.add(varName);
                }
                // check if it is dot variable
                else if(ctx.var(varCount).dotVariable() != null) {
                    String varName = ctx.var(varCount).dotVariable().getText();
                    // calls function that check type and translate it to C
                    val += typeChecker.checkType(varName, symbolTable);
                    variableNames.add(varName);
                }
                varCount++;
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
