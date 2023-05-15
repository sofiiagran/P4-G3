package TL.compiler.CodeGen.TypeChecker;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLLexer;
import TL.parser.TLParser;

public class TypeCheckerCon1 {

    Boolean stringEqual = false;
    public void typeCheckCon1(TLParser.Con1Context ctx, SymbolTable symbolTable) {

        int varCount = 0;
        int valCount = 0;

        for (int i = 0; i < ctx.conditionalOperation().size(); i++) {

            switch (ctx.conditionalOperation(i).getText()) {

                case "==", "?=", "!=", "is not" -> {

                    if (ctx.ID(varCount) != null) {
                        String leftVar = ctx.ID(varCount).getText();
                        varCount++;
                        if (symbolTable.isInScope(new Attributes(leftVar, null))) {
                            Type leftVarType = symbolTable.retrieveSymbol(leftVar).getType();

                            switch (leftVarType) {
                                case Number -> {
                                    if (ctx.ID(varCount) != null) {
                                        String rightVar = ctx.ID(varCount).getText();
                                        varCount++;
                                        if (symbolTable.isInScope(new Attributes(rightVar, null))) {
                                            Type rightVarType = symbolTable.retrieveSymbol(rightVar).getType();
                                            if (rightVarType != Type.Number) {
                                                throw new IllegalArgumentException(
                                                        "All values must be of same type in conditions");
                                            }
                                        } else {
                                            throw new IllegalArgumentException(
                                                    "Variable: " + rightVar + " is not declared");
                                        }
                                    }
                                    if (ctx.val(valCount) != null) {
                                        if (ctx.val(valCount).numberVal == null) {
                                            throw new IllegalArgumentException(
                                                    "All values must be of same type in conditions");
                                        }
                                        valCount++;
                                    }

                                }
                                case Text -> {
                                    if (ctx.ID(varCount) != null) {
                                        String rightVar = ctx.ID(varCount).getText();
                                        varCount++;
                                        if (symbolTable.isInScope(new Attributes(rightVar, null))) {
                                            Type rightVarType = symbolTable.retrieveSymbol(rightVar).getType();
                                            if (rightVarType != Type.Text) {
                                                throw new IllegalArgumentException(
                                                        "All values must be of same type in conditions");
                                            } else {
                                                stringEqual = true;
                                                getStringEqual(leftVar, rightVar, ctx.conditionalOperation(i).getText());
                                            }
                                        } else {
                                            throw new IllegalArgumentException(
                                                    "Variable: " + rightVar + " is not declared");
                                        }
                                    }
                                    if (ctx.val(valCount) != null) {
                                        if (ctx.val(valCount).textVal == null) {
                                            throw new IllegalArgumentException(
                                                    "All values must be of same type in conditions");
                                        }
                                        valCount++;
                                    }
                                }
                                case Boolean -> {
                                    if (ctx.ID(varCount) != null) {
                                        String rightVar = ctx.ID(varCount).getText();
                                        varCount++;
                                        if (symbolTable.isInScope(new Attributes(rightVar, null))) {
                                            Type rightVarType = symbolTable.retrieveSymbol(rightVar).getType();
                                            if (rightVarType != Type.Boolean) {
                                                throw new IllegalArgumentException(
                                                        "All values must be of same type in conditions");
                                            }
                                        } else {
                                            throw new IllegalArgumentException(
                                                    "Variable: " + rightVar + " is not declared");
                                        }
                                    }
                                    if (ctx.val(valCount) != null) {
                                        if (ctx.val(valCount).boolVal == null) {
                                            throw new IllegalArgumentException(
                                                    "All values must be of same type in conditions");
                                        }
                                        valCount++;
                                    }
                                }
                                default -> throw new IllegalArgumentException(
                                        "Type not found by type-checker.");
                            }
                        } else {
                            throw new IllegalArgumentException("Variable: " + leftVar + "is not declared");
                        }
                    }

                    if (ctx.val(valCount) != null) {
                        if (ctx.val(valCount).numberVal != null) {
                            valCount++;
                            if (ctx.ID(varCount) != null) {
                                String rightVarName = ctx.ID(varCount).getText();
                                varCount++;
                                if (symbolTable.isInScope(new Attributes(rightVarName, null))) {
                                    if (symbolTable.retrieveSymbol(rightVarName).getType() != Type.Number) {
                                        throw new IllegalArgumentException(
                                                "All values must be of same type in conditions");
                                    }
                                } else {
                                    throw new IllegalArgumentException(
                                            "Variable: " + rightVarName + " is not declared");
                                }
                            }
                            if (ctx.val(valCount) != null) {
                                if (ctx.val(valCount).numberVal == null) {
                                    throw new IllegalArgumentException(
                                            "All values must be of same type in conditions");
                                }
                                valCount++;
                            }
                        }
                    }
                    if (ctx.val(valCount) != null) {
                        if (ctx.val(valCount).textVal != null) {
                            valCount++;
                            if (ctx.ID(varCount) != null) {
                                String rightVarName = ctx.ID(varCount).getText();
                                varCount++;
                                if (symbolTable.isInScope(new Attributes(rightVarName, null))) {
                                    if (symbolTable.retrieveSymbol(rightVarName).getType() != Type.Text) {
                                        throw new IllegalArgumentException(
                                                "All values must be of same type in conditions");
                                    }
                                } else {
                                    throw new IllegalArgumentException(
                                            "Variable: " + rightVarName + " is not declared");
                                }
                            }
                            if (ctx.val(valCount) != null) {
                                if (ctx.val(valCount).textVal == null) {
                                    throw new IllegalArgumentException(
                                            "All values must be of same type in conditions");
                                }
                                valCount++;
                            }
                        }
                    }
                    if (ctx.val(valCount) != null) {
                        if (ctx.val(valCount).boolVal != null) {
                            valCount++;
                            if (ctx.ID(varCount) != null) {
                                String rightVarName = ctx.ID(varCount).getText();
                                varCount++;
                                if (symbolTable.isInScope(new Attributes(rightVarName, null))) {
                                    if (symbolTable.retrieveSymbol(rightVarName).getType() != Type.Boolean) {
                                        throw new IllegalArgumentException(
                                                "All values must be of same type in conditions");
                                    }
                                } else {
                                    throw new IllegalArgumentException(
                                            "Variable: " + rightVarName + " is not declared");
                                }
                                if (ctx.val(valCount) != null) {
                                    if (ctx.val(valCount).boolVal == null) {
                                        throw new IllegalArgumentException(
                                                "All values must be of same type in conditions");
                                    }
                                    valCount++;
                                }
                            }
                        }
                    }
                }
                case "<", "<=", ">", ">=" -> {
                    if (ctx.ID(varCount) != null) {
                        String leftVar = ctx.ID(varCount).getText();
                        varCount++;
                        if (symbolTable.isInScope(new Attributes(leftVar, null))) {
                            Type leftVarType = symbolTable.retrieveSymbol(leftVar).getType();

                            switch (leftVarType) {
                                case Number -> {
                                    if (ctx.ID(varCount) != null) {
                                        String rightVar = ctx.ID(varCount).getText();
                                        varCount++;
                                        if (symbolTable.isInScope(new Attributes(rightVar, null))) {
                                            Type rightVarType = symbolTable.retrieveSymbol(rightVar).getType();
                                            if (rightVarType != Type.Number) {
                                                throw new IllegalArgumentException(
                                                        "All values must be of type number for operators:" +
                                                                "\"<\", \"<=\", \">\", \">=\" ");
                                            }
                                        } else {
                                            throw new IllegalArgumentException(
                                                    "Variable: " + rightVar + " is not declared");
                                        }
                                    }
                                    if (ctx.val(valCount) != null) {
                                        if (ctx.val(valCount).numberVal == null) {
                                            throw new IllegalArgumentException(
                                                    "All values must be of type number for operators:" +
                                                            "\"<\", \"<=\", \">\", \">=\" ");
                                        }
                                        valCount++;
                                    }
                                }
                                case Text, Boolean -> {
                                    throw new IllegalArgumentException(
                                            "All values must be of type number for operators:" +
                                                    "\"<\", \"<=\", \">\", \">=\" ");
                                }
                                default -> throw new IllegalArgumentException("Type not found by type-checker.");
                            }
                        } else {
                            throw new IllegalArgumentException(
                                    "Variable: " + leftVar + " is not declared");
                        }
                    }

                    if (ctx.val(valCount) != null) {
                        if (ctx.val(valCount).numberVal != null) {
                            valCount++;
                            if (ctx.ID(varCount) != null) {
                                String rightVarName = ctx.ID(varCount).getText();
                                varCount++;
                                if (symbolTable.isInScope(new Attributes(rightVarName, null))) {
                                    if (symbolTable.retrieveSymbol(rightVarName).getType() != Type.Number) {
                                        throw new IllegalArgumentException(
                                                "All values must be of type number for operators:" +
                                                        "\"<\", \"<=\", \">\", \">=\" ");
                                    }
                                } else {
                                    throw new IllegalArgumentException(
                                            "Variable: " + rightVarName + " is not declared");
                                }
                            }
                            if (ctx.val(valCount) != null) {
                                if (ctx.val(valCount).numberVal == null) {
                                    throw new IllegalArgumentException(
                                            "All values must be of type number for operators:" +
                                                    "\"<\", \"<=\", \">\", \">=\" ");
                                }
                                valCount++;
                            }
                        } else {
                            throw new IllegalArgumentException(
                                    "All values must be of type number for operators:" +
                                            "\"<\", \"<=\", \">\", \">=\" ");
                        }
                    }
                }
            }
        }
    }

        public String getStringEqual (String string1, String string2, String operator){
            String condition = "";

            if (operator == "==" || operator == "?=") {
                condition = "strcmp(" + string1 + ", " + string2 + ") == 0";
            }
            if (operator == "!=" || operator == "is not") {
                condition = "strcmp(" + string1 + ", " + string2 + ") != 0";
            }
            return condition;
        }
}
