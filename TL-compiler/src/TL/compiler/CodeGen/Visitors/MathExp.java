package TL.compiler.CodeGen.Visitors;

import TL.compiler.CodeGen.TypeChecker.TypeCheckerMathExp;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class MathExp {
    TypeCheckerMathExp typeCheckerMathExp1 = new TypeCheckerMathExp();
    public String visitMathExpr(TLParser.MathExpContext ctx, SymbolTable symbolTable){

        String printMathExpr = "";
        Boolean isDeclared = false;

        String assignIdName = ctx.assignID.getText();

        // check if assign id is a dot variable
        if(ctx.assignID.dotVariable() != null) {
            if (ctx.assignID.dotVariable().askID != null) {
                //if ask ID is declared, set isDeclared to true, else throw error
                assignIdName = ctx.assignID.dotVariable().askID.getText();
                if (symbolTable.isInScope(new Attributes(assignIdName, null))) {
                    isDeclared = true;
                } else {
                    throw new IllegalArgumentException("Cannot use variable: " + assignIdName + ".answer"
                            + " in math expressions, since: " + assignIdName + " is not declared");
                }
            } else if (ctx.assignID.dotVariable().instanceName != null) {
                // if instance is declared, set isDeclared to true, else throw error
                // it checks if instance name is declared, since field will be checked by type checker
                String instanceName = ctx.assignID.dotVariable().instanceName.getText();
                if (symbolTable.isInScope(new Attributes(instanceName, null))) {
                    assignIdName = instanceName + "." + ctx.assignID.dotVariable().field.getText();
                    isDeclared = true;
                } else {
                    throw new IllegalArgumentException("Cannot use variable: " + assignIdName + " in math expressions," +
                            " since: " + assignIdName + " is not declared");
                }
            } else if (ctx.assignID.dotVariable().listID != null) {
                // if list is declared, set isDeclared to true, else throw error
                String listID = ctx.assignID.dotVariable().listID.getText();
                if (symbolTable.isInScope(new Attributes(listID, null))) {
                    assignIdName = listID + "[" + ctx.assignID.dotVariable().NUMBER_VAL_INT() + "]";
                    isDeclared = true;
                } else {
                    throw new IllegalArgumentException("Cannot use variable: " + assignIdName + " in math expressions," +
                            " since: " + listID + " is not declared");
                }
            }
        }
        // if it is not a dot variable this function is called
        // it return isDeclared = true if variable is declared, if not, it adds it to symbol table and return false
        else if (symbolTable.isInScope(new Attributes(assignIdName, null))) {
            isDeclared = true;
        } else {
            symbolTable.insertSymbol(new Attributes(assignIdName, Type.Number));
            isDeclared = false;
        }

        for(int i = 0; i < (ctx.var().size() - 1); i++){
            String var1 = ctx.var(i).getText();
            String var2 = ctx.var(i + 1).getText();

            // check if it is dot varibles
            if(ctx.var(i).dotVariable() != null) {
                if(ctx.var(i).dotVariable().askID != null){
                    var1 = ctx.var(i).dotVariable().askID.getText();
                } else if (ctx.var(i).dotVariable().instanceName != null) {
                    var1 = ctx.var(i).dotVariable().field.getText();
                } else if (ctx.var(i).dotVariable().listID != null) {
                    String listID = ctx.var(i).dotVariable().listID.getText();
                    var1 = ctx.var(i).dotVariable().listID.getText() + "["
                            + ctx.var(i).dotVariable().NUMBER_VAL_INT().getText() + "]";
                    // if list is declared, add ny variable to symbol table with the right type
                    if (symbolTable.isInScope(new Attributes(listID, null))) {
                        if (symbolTable.retrieveSymbol(listID).getType() == Type.NumberList) {
                            symbolTable.insertSymbol(new Attributes(var1, Type.Number));
                        } else if (symbolTable.retrieveSymbol(listID).getType() == Type.TextList) {
                            symbolTable.insertSymbol(new Attributes(var1, Type.Text));
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot use variable: " + var1 + " in math expressions," +
                                " since: " + listID + " is not declared");
                    }
                }
            }
            if(ctx.var(i + 1).dotVariable() != null) {
                if(ctx.var(i + 1).dotVariable().askID != null){
                    var2 = ctx.var(i + 1).dotVariable().askID.getText();
                } else if (ctx.var(i + 1).dotVariable().instanceName != null) {
                    var2 = ctx.var(i + 1).dotVariable().field.getText();
                } else if (ctx.var(i + 1).dotVariable().listID != null) {
                    String listID = ctx.var(i + 1).dotVariable().listID.getText();
                    var2 = ctx.var(i + 1).dotVariable().listID.getText() + "["
                            + ctx.var(i + 1).dotVariable().NUMBER_VAL_INT().getText() + "]";
                    // if list is declared, add ny variable to symbol table with the right type
                    if (symbolTable.isInScope(new Attributes(listID, null))) {
                        if (symbolTable.retrieveSymbol(listID).getType() == Type.NumberList) {
                            symbolTable.insertSymbol(new Attributes(var2, Type.Number));
                        } else if (symbolTable.retrieveSymbol(listID).getType() == Type.TextList) {
                            symbolTable.insertSymbol(new Attributes(var2, Type.Text));
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot use variable: " + var2 + " in math expressions," +
                                " since: " + listID + " is not declared");
                    }
                }
            }
            // type checker is called to check for compatible types
            typeCheckerMathExp1.typeCheckMathExp1(var1, var2, symbolTable);
        }

        // this is called if the assign variable was not declared beforehand (then it includes data type in expression)
        if(isDeclared == false){
            if(symbolTable.retrieveSymbol(assignIdName).getType() == Type.Number){
                printMathExpr += "double " + assignIdName;
            }
            else if(symbolTable.retrieveSymbol(assignIdName).getType() == Type.Text){
                printMathExpr += "char * " + assignIdName;
            }
            else if(symbolTable.retrieveSymbol(assignIdName).getType() == Type.Boolean){
                printMathExpr += "bool " + assignIdName;
            }
        } else {
            printMathExpr += assignIdName;
        }

        int numberCount = 0;
        int varCount = 1;

        //loops through children and add values to string,
        // ignores the first child, since it is already added to string
        for (int i = 1; i < ctx.getChildCount(); i++) {

            if (ctx.getChild(i) == ctx.numberValue(numberCount)) {
                if (ctx.numberValue(numberCount).NUMBER_VAL_INT() != null) {
                    // adds .0 if integer
                    numberCount++;
                    printMathExpr += " " + ctx.getChild(i).getText() + ".0";
                } else {
                    numberCount++;
                    printMathExpr += " " + ctx.getChild(i).getText();
                }
            } else if(ctx.getChild(i) == ctx.var(varCount)) {
                if(ctx.var(varCount).ID() != null) {
                    printMathExpr += " " + ctx.getChild(i).getText();
                }
                else if(ctx.var(varCount).dotVariable() != null) {
                    if (ctx.var(varCount).dotVariable().askID != null) {
                        printMathExpr += " " + ctx.var(varCount).dotVariable().askID.getText();
                    } else if (ctx.var(varCount).dotVariable().instanceName != null) {
                        printMathExpr += " " + ctx.var(varCount).dotVariable().instanceName.getText()
                                            + "." + ctx.var(varCount).dotVariable().field.getText();
                    } else if (ctx.var(varCount).dotVariable().listID != null) {
                        printMathExpr += " " + ctx.var(varCount).dotVariable().listID.getText() + "["
                                + ctx.var(varCount).dotVariable().NUMBER_VAL_INT().getText() + "]";
                    }
                }
                varCount++;
            }

            else {
                printMathExpr += " " + ctx.getChild(i).getText();
            }
        }
        //return final string
        return "    " + printMathExpr + ";\n";
    }
}
