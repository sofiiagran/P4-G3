package TL.compiler.CodeGen.TypeChecker;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class TypeCheckerMathExp1 {

    public String typeCheckMathExp1(TLParser.MathExp1Context ctx, SymbolTable symbolTable) {
        String errorText = "";
        String assignID = ctx.assignId.getText();

        switch (ctx.mathOp.getText()) {

            case "+" -> {
                switch (symbolTable.retrieveSymbol(assignID).getType()) {

                    case Number -> {

                        if (ctx.leftVar != null) {
                            String leftVarName = ctx.leftVar.getText();
                            if (symbolTable.isInScope(new Attributes(leftVarName, null))) {
                                if (symbolTable.retrieveSymbol(leftVarName).getType() != Type.Number) {
                                    errorText = "All values must be of same datatype";
                                }
                            } else {
                                errorText = "Variable: " + leftVarName + " is not declared";
                            }

                        }
                        if (ctx.leftVal != null) {
                            if (ctx.leftVal.numberVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }
                        if (ctx.rightVar != null) {
                            String rightVarName = ctx.rightVar.getText();
                            if (symbolTable.isInScope(new Attributes(rightVarName, null))) {
                                if (symbolTable.retrieveSymbol(rightVarName).getType() != Type.Number) {
                                    errorText = "All values must be of same datatype";
                                }
                            } else {
                                errorText = "Variable: " + rightVarName + " is not declared";
                            }

                        }
                        if (ctx.rightVal != null) {
                            if (ctx.rightVal.numberVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }

                    }
                    case Text -> {

                        if (ctx.leftVar != null) {
                            String leftVarName = ctx.leftVar.getText();
                            if (symbolTable.isInScope(new Attributes(leftVarName, null))) {
                                if (symbolTable.retrieveSymbol(leftVarName).getType() != Type.Text) {
                                    errorText = "All values must be of same datatype";
                                }
                            } else {
                                errorText = "Variable: " + leftVarName + " is not declared";
                            }
                        }
                        if (ctx.leftVal != null) {
                            if (ctx.leftVal.textVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }
                        if (ctx.rightVar != null) {
                            String rightVarName = ctx.rightVar.getText();
                            if (symbolTable.isInScope(new Attributes(rightVarName, null))) {
                                if (symbolTable.retrieveSymbol(rightVarName).getType() != Type.Text) {
                                    errorText = "All values must be of same datatype";
                                }
                            } else {
                                errorText = "Variable: " + rightVarName + " is not declared";
                            }

                        }
                        if (ctx.rightVal != null) {
                            if (ctx.rightVal.textVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }

                    }
                    case Boolean -> {
                        errorText = "Cannot do math expression with boolean value";
                    }
                    default -> throw new IllegalArgumentException("Type not found by type-checker.");
                }

            }


            case "-", "*", "/" -> {

                switch (symbolTable.retrieveSymbol(assignID).getType()) {


                    case Number -> {

                        if (ctx.leftVar != null) {
                            String leftVarName = ctx.leftVar.getText();
                            if (symbolTable.isInScope(new Attributes(leftVarName, null))) {
                                if (symbolTable.retrieveSymbol(leftVarName).getType() != Type.Number) {
                                    errorText = "All values must be of same datatype";
                                }
                            } else {
                                errorText = "Variable: " + leftVarName + " is not declared";
                            }
                        }
                        if (ctx.leftVal != null) {
                            if (ctx.leftVal.numberVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }
                        if (ctx.rightVar != null) {
                            String rightVarName = ctx.rightVar.getText();
                            if (symbolTable.isInScope(new Attributes(rightVarName, null))) {
                                if (symbolTable.retrieveSymbol(rightVarName).getType() != Type.Number) {
                                    errorText = "All values must be of same datatype";
                                }
                            } else {
                                errorText = "Variable: " + rightVarName + " is not declared";
                            }

                        }
                        if (ctx.rightVal != null) {
                            if (ctx.rightVal.numberVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }

                    }
                    case Text -> {
                        errorText = "Cannot do math expression that are not plus, with text values.";
                    }
                    case Boolean -> {
                        errorText = "Cannot do math expression with boolean value";
                    }
                    default -> throw new IllegalArgumentException("Type not found by type-checker.");

                }
            }
            default -> throw new IllegalArgumentException("Type not found by type-checker.");
        }
        System.err.println(errorText);
        return errorText;
    }
}