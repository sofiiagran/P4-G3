package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

import java.util.ArrayList;

public class FuncDec {

    ArrayList<String> returnTypeArray = new ArrayList<>();

    public void setReturnType(TLParser.FuncDecContext ctx, SymbolTable symbolTable) {

        String funcName = ctx.funcID.getText();
        //default type void
        Type returnDt = Type.Void;

        //loop that visit children and looks for return statement
        for(int i = 0; i < ctx.getChildCount(); i++) {

            if(ctx.getChild(i) == ctx.returnExp()) {

                //checks if it returns a variable
                if(ctx.returnExp().returnVar != null) {
                    String varName = ctx.returnExp().returnVar.getText();
                    if (ctx.returnExp().returnVar.dotVariable() != null) {
                        if (ctx.returnExp().returnVar.dotVariable().listID != null) {
                            varName = ctx.returnExp().returnVar.dotVariable().listID.getText() + "["
                                    + ctx.returnExp().returnVar.dotVariable().NUMBER_VAL_INT().getText() + "]";
                        } else if (ctx.returnExp().returnVar.dotVariable().instanceName != null) {
                            varName = ctx.returnExp().returnVar.dotVariable().instanceName.getText() + "."
                                    + ctx.returnExp().returnVar.dotVariable().field.getText();
                        } else if (ctx.returnExp().returnVar.dotVariable().askID != null) {
                            varName = ctx.returnExp().returnVar.dotVariable().askID.getText();
                        }
                        if (symbolTable.isInScope(new Attributes(varName, null))) {
                            returnDt = symbolTable.retrieveSymbol(varName).getType();
                        }
                    }
                }
                //checks if it returns a value
                else if(ctx.returnExp().returnVal != null) {

                    if(ctx.returnExp().returnVal == ctx.returnExp().returnVal.numberVal.NUMBER_VAL_DOUBLE() ) {
                        returnDt = Type.Number;
                    }
                    else if(ctx.returnExp().returnVal == ctx.returnExp().returnVal.numberVal.NUMBER_VAL_INT() ) {
                        returnDt = Type.Number;
                    }
                    else if(ctx.returnExp().returnVal == ctx.returnExp().returnVal.textVal) {
                        returnDt = Type.Text;
                    }
                    else if(ctx.returnExp().returnVal == ctx.returnExp().returnVal.boolVal) {
                        returnDt = Type.Boolean;
                    }
                }

            }

        }
        //insert function with return type to symbol table
        Attributes attribute = new Attributes(funcName, returnDt);
        symbolTable.insertSymbol(attribute);
    }
    public String getReturnType(TLParser.FuncDecContext ctx, SymbolTable symbolTable) {

        String funcName = ctx.funcID.getText();
        String returnType = "";

        // translate TL return types to C types
        if(symbolTable.retrieveSymbol(funcName) != null) {

            if (symbolTable.retrieveSymbol(funcName).getType() == Type.Text) {
                returnType += "const char*";
            }
            else if ((symbolTable.retrieveSymbol(funcName).getType()) == Type.Number) {
                returnType += "double";
            }
            else if ((symbolTable.retrieveSymbol(funcName).getType()) == Type.Boolean) {
                returnType += "bool";
            }
            else if ((symbolTable.retrieveSymbol(funcName).getType()) == Type.Void) {
                returnType += "void";
            }
        }
        returnTypeArray.add(returnType);
        return returnType;
    }

    public ArrayList<String> getReturnTypeArray(){
        return returnTypeArray;
    }

}
