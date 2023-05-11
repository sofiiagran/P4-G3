package TL.compiler.CodeGen.TypeChecker;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class TypeCheckerCon1 {
    public String typeCheckCon1(TLParser.Con1Context ctx, SymbolTable symbolTable) {
        String errorText = "";

        if (ctx.leftConVar != null) {
            String leftVar = ctx.leftConVar.getText();
            if(symbolTable.isInScope(new Attributes(leftVar, null))){
                Type leftVarType = symbolTable.retrieveSymbol(leftVar).getType();

                switch (leftVarType) {

                    case Number -> {
                        if (ctx.rightConVar != null) {
                            String rightVar = ctx.rightConVar.getText();
                            if (symbolTable.isInScope(new Attributes(rightVar, null))) {
                                Type rightVarType = symbolTable.retrieveSymbol(rightVar).getType();
                                if (rightVarType != Type.Number) {
                                    errorText = "All values must be of same datatype";
                                }
                            }
                        }
                        if(ctx.rightConVal != null) {
                            if (ctx.rightConVal.numberVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }

                    }
                    case Text -> {
                        if (ctx.rightConVar != null) {
                            String rightVar = ctx.rightConVar.getText();
                            if (symbolTable.isInScope(new Attributes(rightVar, null))) {
                                Type rightVarType = symbolTable.retrieveSymbol(rightVar).getType();
                                if (rightVarType != Type.Text) {
                                    errorText = "All values must be of same datatype";
                                }
                            }
                        }
                        if(ctx.rightConVal != null) {
                            if (ctx.rightConVal.textVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }
                    }
                    case Boolean -> {
                        if (ctx.rightConVar != null) {
                            String rightVar = ctx.rightConVar.getText();
                            if (symbolTable.isInScope(new Attributes(rightVar, null))) {
                                Type rightVarType = symbolTable.retrieveSymbol(rightVar).getType();
                                if (rightVarType != Type.Boolean) {
                                    errorText = "All values must be of same datatype";
                                }
                            }
                        }
                        if(ctx.rightConVal != null) {
                            if (ctx.rightConVal.boolVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }
                    }
                    default -> throw new IllegalArgumentException("Type not found by type-checker.");
                }
            }
            errorText = "Variable: " + leftVar + " is not declared";
        }
        if(ctx.leftConVal != null){
            if(ctx.leftConVal.numberVal != null){
                if(ctx.rightConVar != null){
                    String rightVarName= ctx.rightConVar.getText();
                    if(symbolTable.isInScope(new Attributes(rightVarName, null))) {
                        if(symbolTable.retrieveSymbol(rightVarName).getType() != Type.Number){
                            errorText = "All values must be of same datatype";
                        }
                    } else {
                        errorText = "Variable: " + ctx.rightConVar.getText() + " is not declared";
                    }
                }
                if(ctx.rightConVal != null) {
                    if(ctx.rightConVal.numberVal == null){
                        errorText = "All values must be of same datatype";
                    }
                }
            }
            if(ctx.leftConVal.textVal != null){
                if(ctx.rightConVar != null){
                    String rightVarName= ctx.rightConVar.getText();
                    if(symbolTable.isInScope(new Attributes(rightVarName, null))) {
                        if(symbolTable.retrieveSymbol(rightVarName).getType() != Type.Text){
                            errorText = "All values must be of same datatype";
                        }
                    } else {
                        errorText = "Variable: " + ctx.rightConVar.getText() + " is not declared";
                    }
                }
                if(ctx.rightConVal != null) {
                    if(ctx.rightConVal.textVal == null){
                        errorText = "All values must be of same datatype";
                    }
                }
            }
            if(ctx.leftConVal.boolVal != null){
                if(ctx.rightConVar != null){
                    String rightVarName= ctx.rightConVar.getText();
                    if(symbolTable.isInScope(new Attributes(rightVarName, null))) {
                        if(symbolTable.retrieveSymbol(rightVarName).getType() != Type.Boolean){
                            errorText = "All values must be of same datatype";
                        }
                    } else {
                        errorText = "Variable: " + ctx.rightConVar.getText() + " is not declared";
                    }
                }
                if(ctx.rightConVal != null) {
                    if(ctx.rightConVal.boolVal == null){
                        errorText = "All values must be of same datatype";
                    }
                }
            }
        }

        System.err.println(errorText);
        return errorText;
    }
}
