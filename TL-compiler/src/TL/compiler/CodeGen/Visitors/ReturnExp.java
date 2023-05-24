package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class ReturnExp {
    String varName;
    String returnName;

    public String visitReturnExpr(TLParser.ReturnExpContext ctx, SymbolTable symbolTable){
        varName = "";
        if(ctx.returnVar != null) {

            // if it is a dot variable, this is handled in code gen
            if (ctx.returnVar.dotVariable() != null) {
                if (ctx.returnVar.dotVariable().instanceName != null) {

                    String name = ctx.returnVar.dotVariable().instanceName.getText();
                    String field = ctx.returnVar.dotVariable().field.getText();
                    String dotVar = name + "." + field;

                    if (symbolTable.isInScope(new Attributes(dotVar, null))) {
                        returnName = dotVar;
                    } else {
                        //throw error if variable is not declared
                        throw new IllegalArgumentException("Variable: " + name + " is not declared.");
                    }
                } else if (ctx.returnVar.dotVariable().askID != null) {
                    String name = ctx.returnVar.dotVariable().askID.getText();

                    if (symbolTable.isInScope(new Attributes(name, null))) {
                        returnName = name;
                    } else {
                        //throw error if variable is not declared
                        throw new IllegalArgumentException("Variable: " + name + " is not declared.");
                    }
                } else if (ctx.returnVar.dotVariable().listID != null) {

                    String name = ctx.returnVar.dotVariable().listID.getText();
                    String dotVar = name + "[" + ctx.returnVar.dotVariable().NUMBER_VAL_INT() + "]";

                    if (symbolTable.isInScope(new Attributes(dotVar, null))) {
                        returnName = dotVar;
                    } else {
                        //throw error if variable is not declared
                        throw new IllegalArgumentException("Variable: " + name + " is not declared.");
                    }
                }
            } else {
                // if it is a variable, but not a dot variable
                if (symbolTable.isInScope(new Attributes(varName, null))) {
                    // throw error if return variable is of type list or error
                    if (symbolTable.retrieveSymbol(varName).getType() == Type.Collection
                            || symbolTable.retrieveSymbol(varName).getType() == Type.NumberList
                            || symbolTable.retrieveSymbol(varName).getType() == Type.TextList) {
                        throw new IllegalArgumentException(
                                "Error: return value cannot be of type collection or list");
                    }
                    returnName = varName;
                } else {
                    throw new IllegalArgumentException("Error: missing variable declaration of variable: " + varName);
                }
            }


        } else if(ctx.returnVal != null) {
            varName = ctx.returnVal.getText();

            // add .0 if value is integer
            if (ctx.returnVal.numberVal.NUMBER_VAL_INT() != null) {
                returnName = ctx.returnVal.getText() + ".0";
            }
            // else: print value as it is
            else {
                returnName = ctx.returnVal.getText();
            }
        }
        return "    return " + returnName + ";" + "\n";

    }
}
