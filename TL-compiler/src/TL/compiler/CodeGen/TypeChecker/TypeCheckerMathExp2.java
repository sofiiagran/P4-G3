package TL.compiler.CodeGen.TypeChecker;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class TypeCheckerMathExp2 {
    public String typeCheckMathExp2 (TLParser.MathExp2Context ctx, SymbolTable symbolTable) {
        String op = null;
        String type = null;
        String errorText = "";

        switch (ctx.mathOp.getText()) {

            case "+=" -> {
                if (ctx.rightVar != null) {

                    String rightVarName = ctx.rightVar.getText();
                    String leftVarName = ctx.leftVar.getText();

                    if (symbolTable.isInScope(new Attributes(rightVarName, null))) {
                        if (symbolTable.isInScope(new Attributes(leftVarName, null))) {
                            if ((symbolTable.retrieveSymbol(leftVarName).getType() != Type.Number
                                    && symbolTable.retrieveSymbol(rightVarName).getType() != Type.Number) ||
                                    (symbolTable.retrieveSymbol(leftVarName).getType() != Type.Text
                                            && symbolTable.retrieveSymbol(rightVarName).getType() != Type.Text)) {
                                //throwTypeError(left, right, errorText);
                                op = ctx.mathOp.getText();
                                type = "either string or integer";
                                errorText = "On operation " + op + ". Both values must be of the same type: " + type;

                            }

                        } else {
                            errorText = "Variable: " + leftVarName + " is not declared";
                        }
                    } else {
                        errorText = "Variable: " + rightVarName + " is not declared";
                    }
                }


                if (ctx.rightVal != null) {

                    String leftVarName = ctx.leftVar.getText();

                    if (symbolTable.isInScope(new Attributes(leftVarName, null))) {
                        if ((symbolTable.retrieveSymbol(leftVarName).getType() != Type.Number
                                && ctx.rightVal.numberVal == null)
                                || (symbolTable.retrieveSymbol(leftVarName).getType() != Type.Text
                                && ctx.rightVal.textVal == null)) {
                            //throwTypeError(left, right, errorText);
                            op = ctx.mathOp.getText();
                            type = "either string or integer";
                            errorText = "On operation " + op + ". Both values must be of the same type: " + type;
                        }

                    } else {
                        errorText = "Variable: " + leftVarName + " is not declared";
                    }

                }
            }

            case "-=", "*=", "/=" -> {

                if (ctx.rightVar != null) {

                    String rightVarName = ctx.rightVar.getText();
                    String leftVarName = ctx.leftVar.getText();

                    if (symbolTable.isInScope(new Attributes(rightVarName, null))) {
                        if (symbolTable.isInScope(new Attributes(leftVarName, null))) {
                            if (symbolTable.retrieveSymbol(leftVarName).getType() != Type.Number
                                    && symbolTable.retrieveSymbol(rightVarName).getType() != Type.Number) {
                                //throwTypeError(left, right, errorText);
                                op = ctx.mathOp.getText();
                                type = "integer";
                                errorText = "On operation " + op + ". Both values must be of the same type: " + type;

                            }

                        } else {
                            errorText = "Variable: " + leftVarName + " is not declared";
                        }
                    } else {
                        errorText = "Variable: " + rightVarName + " is not declared";
                    }
                }

                if (ctx.rightVal != null) {
                    String leftVarName = ctx.leftVar.getText();

                    if (symbolTable.isInScope(new Attributes(leftVarName, null))) {
                        if (symbolTable.retrieveSymbol(leftVarName).getType() != Type.Number
                                && ctx.rightVal.numberVal != null) {
                            //throwTypeError(left, right, errorText);
                            op = ctx.mathOp.getText();
                            type = "integer";
                            errorText = "On operation " + op + ". Both values must be of the same type: " + type;
                        }
                    }
                }
            }
            default -> throw new IllegalArgumentException("Type not found by type-checker.");
        }
        System.out.println(errorText);
        return errorText;
    }
}
