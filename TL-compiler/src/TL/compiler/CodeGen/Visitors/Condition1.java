package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class Condition1 {

    String stringCondition;
    String condition;
    String returnCondition;

    ConOp op = new ConOp();

    public String visitCondition1(TLParser.Con1Context ctx, SymbolTable symbolTable) {
        int varCount = 0;
        int valCount = 0;
        int conOpCount = 0;
        int andCount = 0;
        int orCount = 0;

        returnCondition = "";

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) == ctx.conditionalOperation(conOpCount)) {


                String operator = op.visitConditionOp(ctx, conOpCount);
                conOpCount++;
                if (ctx.getChild(i - 1) == ctx.var(varCount)) {
                    // checks if it contains an ID
                    if (ctx.var(varCount).ID() != null) {
                        String leftVar = ctx.var(varCount).ID().getText();
                        //check if left variable is declared, if it is not declared, error is thrown
                        if (symbolTable.isInScope(new Attributes(leftVar, null))) {
                            Type leftVarType = symbolTable.retrieveSymbol(leftVar).getType();
                            varCount++;

                            // check if next child is a variable
                            if (ctx.getChild(i + 1) == ctx.var(varCount)) {

                                // check if the variable is an ID
                                if (ctx.var(varCount).ID() != null) {
                                    String rightVar = ctx.var(varCount).ID().getText();
                                    returnCondition += checkTypes(leftVar, rightVar, symbolTable, operator);
                                }
                                // check if the variable is a dot variable
                                else if (ctx.var(varCount).dotVariable() != null) {
                                    String rightVar = "";
                                    // check if it is a collection variable / contain an instance name
                                    if (ctx.var(varCount).dotVariable().instanceName != null) {

                                        String instanceName = ctx.var(varCount).dotVariable().instanceName.getText();
                                        String field = ctx.var(varCount).dotVariable().field.getText();

                                        // check if both instance name and field is declared, if so,
                                        // leftVar is set to name . field, and added to symbol table with teh same type as field
                                        if (symbolTable.isInScope(new Attributes(instanceName, null))
                                                && symbolTable.isInScope(new Attributes(field, null))) {

                                            rightVar = instanceName + "." + field;
                                            Type fieldType = symbolTable.retrieveSymbol(field).getType();

                                            symbolTable.insertSymbol(new Attributes(rightVar, fieldType));

                                        } else {
                                            throw new IllegalArgumentException("Cannot use variable: \"" + instanceName + " get "
                                                    + field + "\" in math expressions," + " since: "
                                                    + instanceName + " or " + field + " is not declared");
                                        }
                                    }
                                    // check if the dot variable contains a listID / is a list variable
                                    else if (ctx.var(varCount).dotVariable().listID != null) {

                                        String listID = ctx.var(varCount).dotVariable().listID.getText();
                                        String index = ctx.var(varCount).dotVariable().NUMBER_VAL_INT().getText();

                                        if (symbolTable.isInScope(new Attributes(listID, null))) {
                                            rightVar = listID + "[" + index + "]";
                                            if (symbolTable.retrieveSymbol(listID).getType() == Type.NumberList) {
                                                symbolTable.insertSymbol(new Attributes(rightVar, Type.Number));
                                            } else if (symbolTable.retrieveSymbol(listID).getType() == Type.TextList) {
                                                symbolTable.insertSymbol(new Attributes(rightVar, Type.Text));
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Cannot use variable: \" " + listID + " get " +
                                                    index + "\" in math expressions, since: " + listID + " is not declared");
                                        }
                                    }
                                    // check if it is an answer variable / contains an ask ID
                                    else if (ctx.var(varCount).dotVariable().askID != null) {
                                        // set rightVar to ask ID
                                        rightVar = ctx.var(varCount).dotVariable().askID.getText();
                                    }
                                    returnCondition += checkTypes(leftVar, rightVar, symbolTable, operator);
                                }
                                varCount++;
                            } else if (ctx.getChild(i + 1) == ctx.val(valCount)) {
                                // check if both is of type text
                                if (ctx.val(valCount).numberVal != null && leftVarType == Type.Number) {
                                    if (ctx.val(valCount).numberVal.NUMBER_VAL_INT() != null) {
                                        returnCondition += leftVar + " " + operator + " "
                                                + ctx.val(valCount).numberVal.NUMBER_VAL_INT().getText() + ".0 ";
                                    } else if (ctx.val(valCount).numberVal.NUMBER_VAL_DOUBLE() != null) {
                                        returnCondition += leftVar + " " + operator + " "
                                                + ctx.val(valCount).numberVal.NUMBER_VAL_DOUBLE().getText() + " ";
                                    }
                                }
                                // check if both is of type text
                                else if (ctx.val(valCount).textVal != null && leftVarType == Type.Text) {
                                    // this function is called to check if there is a stringEqual statement,
                                    // and it throws error if not
                                    returnCondition += stringEqual(leftVar, ctx.val(valCount).textVal.getText(), operator);
                                }
                                // check if both is of type bool
                                else if (ctx.val(valCount).boolVal != null && leftVarType == Type.Boolean) {
                                    // throw error if operator is not one of the operator that accept boolean values
                                    if (operator == ctx.conOp.conOpEQ.getText() || operator == ctx.conOp.conOpNEQ.getText()) {
                                        returnCondition += leftVar + " " + operator + " "
                                                + ctx.val(valCount).boolVal.getText() + " ";
                                    }
                                    // throw error if operator is not one of the operator that accept boolean values
                                    else {
                                        throw new IllegalArgumentException("All values must be of type number for operators:" +
                                                "\"<\", \"<=\", \">\", \">=\" ");
                                    }
                                }
                                // throw error if they are not of same type
                                else {
                                    throw new IllegalArgumentException("All values must be of same type in conditions");
                                }
                                valCount++;
                            }
                        } else {
                            throw new IllegalArgumentException("All variables must be declared in condition");
                        }
                    }
                    // check if it is a dot variable
                    // does the same as for ID
                    else if (ctx.var(varCount).dotVariable() != null) {
                        String leftVar = "";
                        // check if it is a collection variable / contain an instance name
                        if (ctx.var(varCount).dotVariable().instanceName != null) {

                            String instanceName = ctx.var(varCount).dotVariable().instanceName.getText();
                            String field = ctx.var(varCount).dotVariable().field.getText();

                            // check if both instance name and field is declared, if so,
                            // leftVar is set to name . field, and added to symbol table with teh same type as field
                            if (symbolTable.isInScope(new Attributes(instanceName, null))
                                    && symbolTable.isInScope(new Attributes(field, null))) {

                                leftVar = instanceName + "." + field;
                                Type fieldType = symbolTable.retrieveSymbol(field).getType();
                                symbolTable.insertSymbol(new Attributes(leftVar, fieldType));

                            } else {
                                throw new IllegalArgumentException("Cannot use variable: \"" + instanceName + " get "
                                        + field + "\" in math expressions," + " since: "
                                        + instanceName + " or " + field + " is not declared");
                            }
                        }
                        // check if it is a list variable / contain an listID
                        else if (ctx.var(varCount).dotVariable().listID != null) {

                            String listID = ctx.var(varCount).dotVariable().listID.getText();
                            String index = ctx.var(varCount).dotVariable().NUMBER_VAL_INT().getText();

                            if (symbolTable.isInScope(new Attributes(listID, null))) {
                                leftVar = listID + "[" + index + "]";
                                if (symbolTable.retrieveSymbol(listID).getType() == Type.NumberList) {
                                    symbolTable.insertSymbol(new Attributes(leftVar, Type.Number));
                                } else if (symbolTable.retrieveSymbol(listID).getType() == Type.TextList) {
                                    symbolTable.insertSymbol(new Attributes(leftVar, Type.Text));
                                }
                            } else {
                                throw new IllegalArgumentException("Cannot use variable: \" " + listID + " get " +
                                        index + "\" in math expressions, since: " + listID + " is not declared");
                            }
                        }
                        // if it is an answer variable / contains an ask ID
                        else if (ctx.var(varCount).dotVariable().askID != null) {
                            // set leftVar to ask ID, throw error if not declared
                            leftVar = ctx.var(varCount).dotVariable().askID.getText();
                            if (!symbolTable.isInScope(new Attributes(leftVar, null))) {
                                throw new IllegalArgumentException("Cannot use variable: \"" + leftVar + " get answer\""
                                        + " in math expressions, since: " + leftVar + " is not declared");
                            }
                        }
                        varCount++;
                        Type leftVarType = symbolTable.retrieveSymbol(leftVar).getType();

                        if (ctx.getChild(i + 1) == ctx.var(varCount)) {
                            if (ctx.var(varCount).ID() != null) {
                                String rightVar = ctx.var(varCount).ID().getText();
                                returnCondition += checkTypes(leftVar, rightVar, symbolTable, operator);
                            } else if (ctx.var(varCount).dotVariable() != null) {
                                String rightVar = "";

                                // if it is an answer variable / contains an ask ID
                                if (ctx.var(varCount).dotVariable().askID != null) {
                                    // set rightVar to ask ID
                                    rightVar = ctx.var(varCount).dotVariable().askID.getText();
                                }
                                // if it is a collection variable / contain an instance name
                                else if (ctx.var(varCount).dotVariable().instanceName != null) {

                                    String instanceName = ctx.var(varCount).dotVariable().instanceName.getText();
                                    String field = ctx.var(varCount).dotVariable().field.getText();

                                    // check if both instance name and field is declared, if so,
                                    // leftVar is set to name . field, and added to symbol table with the same type as field
                                    if (symbolTable.isInScope(new Attributes(instanceName, null))
                                            && symbolTable.isInScope(new Attributes(field, null))) {

                                        rightVar = instanceName + "." + field;
                                        Type fieldType = symbolTable.retrieveSymbol(field).getType();

                                        symbolTable.insertSymbol(new Attributes(rightVar, fieldType));

                                    } else {
                                        throw new IllegalArgumentException("Cannot use variable: \"" + instanceName + " get "
                                                + field + "\" in math expressions," + " since: "
                                                + instanceName + " or " + field + " is not declared");
                                    }
                                } else if (ctx.var(varCount).dotVariable().listID != null) {

                                    String listID = ctx.var(varCount).dotVariable().listID.getText();
                                    String index = ctx.var(varCount).dotVariable().NUMBER_VAL_INT().getText();

                                    if (symbolTable.isInScope(new Attributes(listID, null))) {
                                        rightVar = listID + "[" + index + "]";
                                        if (symbolTable.retrieveSymbol(listID).getType() == Type.NumberList) {
                                            symbolTable.insertSymbol(new Attributes(rightVar, Type.Number));
                                        } else if (symbolTable.retrieveSymbol(listID).getType() == Type.TextList) {
                                            symbolTable.insertSymbol(new Attributes(rightVar, Type.Text));
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Cannot use variable: \" " + listID + " get " +
                                                index + "\" in math expressions, since: " + listID + " is not declared");
                                    }
                                }
                                returnCondition += checkTypes(leftVar, rightVar, symbolTable, operator);
                            }
                            varCount++;
                        } else if (ctx.getChild(i + 1) == ctx.val(valCount)) {
                            // check if both is of type text
                            if (ctx.val(valCount).numberVal != null && leftVarType == Type.Number) {
                                if (ctx.val(valCount).numberVal.NUMBER_VAL_INT() != null) {
                                    returnCondition += leftVar + " " + operator + " "
                                            + ctx.val(valCount).numberVal.NUMBER_VAL_INT().getText() + ".0 ";
                                } else if (ctx.val(valCount).numberVal.NUMBER_VAL_DOUBLE() != null) {
                                    returnCondition += leftVar + " " + operator + " "
                                            + ctx.val(valCount).numberVal.NUMBER_VAL_DOUBLE().getText() + " ";
                                }
                            }
                            // check if both is of type text
                            else if (ctx.val(valCount).textVal != null && leftVarType == Type.Text) {
                                // this function is called to check if there is a stringEqual statement,
                                // and it throws error if not
                                returnCondition += stringEqual(leftVar, ctx.val(valCount).textVal.getText(), operator);
                            }
                            // check if both is of type bool
                            else if (ctx.val(valCount).boolVal != null && leftVarType == Type.Boolean) {
                                // throw error if operator is not one of the operator that accept boolean values
                                if (operator == "==" || operator == "!=") {
                                    returnCondition += leftVar + " " + operator + " "
                                            + ctx.val(valCount).boolVal.getText() + " ";
                                }
                                // throw error if operator is not one of the operator that accept boolean values
                                else {
                                    throw new IllegalArgumentException("All values must be of type number for operators:" +
                                            "\"<\", \"<=\", \">\", \">=\" ");
                                }
                            }
                            // throw error if they are not of same type
                            else {
                                throw new IllegalArgumentException("All values must be of same type in conditions");
                            }
                            valCount++;
                        }
                    }
                }
            }else if (ctx.getChild(i) == ctx.AND(andCount)) {
                andCount++;
                returnCondition += " && ";
            } else if (ctx.getChild(i) == ctx.OR(orCount)) {
                orCount++;
                returnCondition += " || ";
            }
        }
        return returnCondition;
    }
        public String checkTypes (String leftVar, String rightVar, SymbolTable symbolTable, String operator){

        condition = "";

            Type leftVarType = symbolTable.retrieveSymbol(leftVar).getType();

            // check if right variable declared, if it is not declared, error is thrown
            if (symbolTable.isInScope(new Attributes(rightVar, null))) {
                // check if both variables has the same type
                if (symbolTable.retrieveSymbol(rightVar).getType() == leftVarType) {
                    // check if it is number variables
                    if (leftVarType == Type.Number) {
                        condition += leftVar + " " + operator + " " + rightVar + " ";
                    }
                    // check if it is text variables
                    else if (leftVarType == Type.Text) {
                        condition += stringEqual(leftVar, rightVar, operator);
                    }
                    // check if it is boolean variables
                    else if (leftVarType == Type.Boolean) {
                        if (operator == "==" || operator == "!=") {
                            condition += leftVar + " " + operator + " " + rightVar + " ";
                        }
                        // throw error if operator is not one of the operator that accept boolean values
                        else {
                            throw new IllegalArgumentException("All values must be of type number for operators:" +
                                    "\"<\", \"<=\", \">\", \">=\" ");
                        }
                    } else {
                        throw new IllegalArgumentException("Type not recognized by type checker: only variables of" +
                                " type: \"truthvalue\", \"number\" and \"text\", are accepted in conditions.");
                    }
                } else {
                    throw new IllegalArgumentException("Error: all variables must be of same type in conditions\n" +
                            "Variable: " + rightVar + " has to be of type: " + leftVarType.toString());
                }
            } else {
                throw new IllegalArgumentException("Error: variable: " + rightVar + " cannot be used in" +
                        " condition since it is not declared");
            }
            return condition;
        }

        public String stringEqual (String string1, String string2, String operator){
            stringCondition = "";

            if (operator == "==") {
                stringCondition = "strcmp(" + string1 + ", " + string2 + ") == 0 ";
            } else if (operator == "!=") {
                stringCondition = "strcmp(" + string1 + ", " + string2 + ") != 0 ";
            } else {
                throw new IllegalArgumentException("All values must be of type number for operators:" +
                        "\"<\", \"<=\", \">\", \">=\" ");
            }
            return stringCondition;
        }

}
