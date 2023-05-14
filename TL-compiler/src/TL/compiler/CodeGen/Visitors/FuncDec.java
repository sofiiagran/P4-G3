package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class FuncDec {

    public void getReturnType(TLParser.FuncDecContext ctx, SymbolTable symbolTable) {

        String funcName = ctx.funcID.getText();
        Type returnDt = Type.Void;

        for(int i = 0; i < ctx.getChildCount(); i++) {

            if(ctx.getChild(i) == ctx.returnExp()) {

                if(ctx.returnExp().returnVar != null) {
                    String varName = ctx.returnExp().returnVar.getText();

                    if(symbolTable.isInScope(new Attributes(varName, null))){
                        returnDt = symbolTable.retrieveSymbol(varName).getType();
                    }
                }
                if(ctx.returnExp().returnVal != null) {

                    if(ctx.returnExp().returnVal == ctx.returnExp().returnVal.numberVal) {
                        returnDt = Type.Number;
                    }
                    if(ctx.returnExp().returnVal == ctx.returnExp().returnVal.textVal) {
                        returnDt = Type.Text;
                    }
                    if(ctx.returnExp().returnVal == ctx.returnExp().returnVal.boolVal) {
                        returnDt = Type.Boolean;
                    }

                }

            }

        }
        Attributes attribute = new Attributes(funcName, returnDt);
        symbolTable.insertSymbol(attribute);
    }
    public String printReturnType(TLParser.FuncDecContext ctx, SymbolTable symbolTable) {

        String funcName = ctx.funcID.getText();
        String returnType = "";

        if(symbolTable.retrieveSymbol(funcName) != null) {

            if (symbolTable.retrieveSymbol(funcName).getType() == Type.Text) {
                returnType += "const char*";
            }
            if ((symbolTable.retrieveSymbol(funcName).getType()) == Type.Number) {
                returnType += "double";
            }
            if ((symbolTable.retrieveSymbol(funcName).getType()) == Type.Boolean) {
                returnType += "bool";
            }
            if ((symbolTable.retrieveSymbol(funcName).getType()) == Type.Void) {
                returnType += "void";
            }
        }
        return returnType;
    }



}
