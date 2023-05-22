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
                else if (ctx.var(varCount).dotVariable() != null) {
                    String varName = "";
                    // if it is an answer variable / contains an ask ID
                    if (ctx.var(varCount).dotVariable().askID != null) {
                        // set rightVar to ask ID
                        varName = ctx.var(varCount).dotVariable().askID.getText();
                        variableNames.add(varName);
                    }
                    // if it is a collection variable / contain an instance name
                    else if (ctx.var(varCount).dotVariable().instanceName != null) {

                        String instanceName = ctx.var(varCount).dotVariable().instanceName.getText();
                        String field = ctx.var(varCount).dotVariable().field.getText();

                        // check if both instance name and field is declared, if so,
                        // leftVar is set to name . field, and added to symbol table with teh same type as field
                        if (symbolTable.isInScope(new Attributes(instanceName, null))
                            && symbolTable.isInScope(new Attributes(field, null))) {

                            varName = instanceName + "." + field;
                            Type fieldType = symbolTable.retrieveSymbol(field).getType();

                            symbolTable.insertSymbol(new Attributes(varName, fieldType));
                            variableNames.add(varName);
                        } else {
                            throw new IllegalArgumentException("Cannot use variable: \"" + instanceName + " get "
                                + field + "\" in math expressions," + " since: "
                                + instanceName + " or " + field + " is not declared");
                        }
                    } else if (ctx.var(varCount).dotVariable().listID != null) {

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
                                index + "\" in math expressions, since: " + listID + " is not declared");
                        }
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
            printVarNames += ", " + variableNames.get(i);
        }
        //print the result string with "" added to start and end, plus variable names printed afterwards
        return val + "\" " + printVarNames;
    }
}
