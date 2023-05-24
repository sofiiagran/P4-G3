package TL.compiler.CodeGen.Visitors;

import TL.compiler.CodeGen.TypeChecker.TypeCheckerPrintBody;
import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

import java.util.ArrayList;

public class QuestionText {

    TypeCheckerPrintBody typeChecker = new TypeCheckerPrintBody();

    public String visitQuestionText(TLParser.TextQuestionContext ctx, SymbolTable symbolTable){
        String varName = ctx.askID.getText();

        // Check if the variable name exists in the symbol table and is of type text
        if (symbolTable.isInScope(new Attributes(varName, Type.Text))) {
            if(symbolTable.retrieveSymbol(varName).getType() == Type.Text){
                return  "\n    printf(" + printBody(ctx, symbolTable) + ");" +
                        "\n    " + "scanf(" + "\"%[^\\n]\"" + ", " + varName + ");" +
                        "\n\n";
            } else {
                // throw error if ask ID is declared with a different type than text.
                throw new IllegalArgumentException("Variable: " + varName + " is already declared with a different " +
                        "data type than text. Ask expression can also read answer of type text.");
            }

        } else {
            //if it does not exist, it is added
            symbolTable.insertSymbol(new Attributes(varName, Type.Text));
            return  "    char " + varName + "[100];" +
                    "\n    printf(" + printBody(ctx, symbolTable) + ");" +
                    "\n    " + "scanf(" + "\"%[^\\n]s\"" + ", " + varName + ");" +
                    "\n\n";
        }
    }
    public String printBody(TLParser.TextQuestionContext ctx, SymbolTable symbolTable){
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
                else if (ctx.var(varCount).dotVariable() != null) {
                    String varName = "";
                    // if it is a collection variable / contain an instance name
                    if (ctx.var(varCount).dotVariable().instanceName != null) {
                        String instanceName = ctx.var(varCount).dotVariable().instanceName.getText();
                        String field = ctx.var(varCount).dotVariable().field.getText();

                        // check if both instance name and field is declared, if so,
                        // leftVar is set to name.field, and added to symbol table with the same data type as field
                        if (symbolTable.isInScope(new Attributes(instanceName, null))
                                && symbolTable.isInScope(new Attributes(field, null))) {

                            varName = instanceName + "." + field;
                            Type fieldType = symbolTable.retrieveSymbol(field).getType();
                            symbolTable.insertSymbol(new Attributes(varName, fieldType));
                            variableNames.add(varName);
                        } else {
                            throw new IllegalArgumentException("Cannot use variable: \"" + instanceName + " get "
                                    + field + "\" in ask expressions," + " since: "
                                    + instanceName + " or " + field + " is not declared");
                        }
                    }
                    // check if it is a list / contains a listID
                    else if (ctx.var(varCount).dotVariable().listID != null) {

                        String listID = ctx.var(varCount).dotVariable().listID.getText();
                        String index = ctx.var(varCount).dotVariable().NUMBER_VAL_INT().getText();

                        if (symbolTable.isInScope(new Attributes(listID, null))) {
                            varName = listID + "[" + index + "]";
                            if (symbolTable.retrieveSymbol(listID).getType() == Type.NumberList) {
                                symbolTable.insertSymbol(new Attributes(varName, Type.Number));
                            } else if (symbolTable.retrieveSymbol(listID).getType() == Type.TextList) {
                                symbolTable.insertSymbol(new Attributes(varName, Type.Text));
                            }
                            variableNames.add(varName);
                        } else {
                            throw new IllegalArgumentException("Cannot use variable: \" " + listID + " get " +
                                    index + "\" in ask expressions, since: " + listID + " is not declared");
                        }
                    }
                    // if it is an answer variable / contains an ask ID
                    else if (ctx.var(varCount).dotVariable().askID != null) {
                        // set rightVar to ask ID
                        varName = ctx.var(varCount).dotVariable().askID.getText();
                        variableNames.add(varName);
                    }
                    // calls function that check type and translate it to C
                    val += typeChecker.checkType(varName, symbolTable);
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