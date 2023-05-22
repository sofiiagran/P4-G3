package TL.compiler.CodeGen.Visitors;

import TL.compiler.CodeGen.TypeChecker.TypeCheckerPrintBody;
import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

import java.util.ArrayList;

public class AskExp {

    TypeCheckerPrintBody typeChecker = new TypeCheckerPrintBody();

    public String visitAskExpr(TLParser.AskExpContext ctx, SymbolTable symbolTable){
        String varName = ctx.askID.getText();

        // Check if the variable name exists in the symbol table and is of type text
        if (symbolTable.isInScope(new Attributes(varName, Type.Text))) {
            if(symbolTable.retrieveSymbol(varName).getType() == Type.Text){
                return  "\n    printf(" + printBody(ctx, symbolTable) + ");" +
                        "\n    " + "scanf(" + "\"%[^\\n]\"" + ", " + "&" +varName + ");" +
                        "\n\n";
            } else {
                // throw error if ask ID is declared with a different type than text.
                throw new IllegalArgumentException("Variable: " + varName + " is already declared with a different " +
                        "data type than text. Ask expression can also read answer of type text.");
            }

        } else {
            //if it does not exist, it is added
            symbolTable.insertSymbol(new Attributes(varName, Type.Text));
            return  "    char * " + varName + ";" +
                    "\n    printf(" + printBody(ctx, symbolTable) + ");" +
                    "\n    " + "scanf(" + "\"%[^\\n]s\"" + ", " + "&" +varName + ");" +
                    "\n\n";
        }
    }
    public String printBody(TLParser.AskExpContext ctx, SymbolTable symbolTable){
        int numberCount = 0;
        int textCount = 0;
        int addCount = 0;
        int varCount = 1;

        ArrayList<String> variableNames = new ArrayList<>();
        String printVarNames = "";
        String val = " \"";

        //loop that visit children (ignore the two first since they are not a part of the print body)
        for (int i = 2; i < ctx.getChildCount(); i++) {
            //checks if the child is a number value
            if (ctx.getChild(i) == ctx.numberValue(numberCount)) {
                if (ctx.numberValue(numberCount).NUMBER_VAL_INT() != null) {
                    // add .0 if it is an int value
                    val += ctx.getChild(i).getText() + ".0";
                }
                else if (ctx.numberValue(numberCount).NUMBER_VAL_DOUBLE() != null) {
                    val += ctx.getChild(i).getText();
                }
                numberCount++;
            }
            //checks if the child is a text value
            else if (ctx.getChild(i) == ctx.TEXT_VAL(textCount)) {
                String newString = ctx.getChild(i).getText();
                //removes the "" since C only accept one string
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
            else if (ctx.getChild(i) == ctx.ADD(addCount)) {
                val += " ";
                addCount++;
            }
        }
        for(int i = 0; i < variableNames.size(); i++){
            printVarNames += ", " + "&" +variableNames.get(i);
        }
        //print the result string with "" added to start and end, plus variable names printed afterwards
        return val + "\" " + printVarNames;
    }

}
