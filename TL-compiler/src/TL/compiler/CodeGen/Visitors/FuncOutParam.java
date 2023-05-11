package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

import java.util.ArrayList;

public class FuncOutParam {

    ArrayList<String> paramNames = new ArrayList<>();

    public String visitOutputParam(TLParser.FuncOutputParamContext ctx, SymbolTable symbolTable) {
        String params = "";
        String varName;

        for(int i = 0; i < ctx.declaration().size(); i++) {

            if(i > 0 && i < ctx.declaration().size()) {
                params += ", ";
            }

            if(ctx.declaration(i).numberDec != null) {
                varName = ctx.declaration(i).numberDec.numberID.getText();
                if(symbolTable.isInScope(new Attributes(varName, Type.Number))) {
                    System.err.println("Error: variable name is already in use");
                    //Throw error
                } else {
                    symbolTable.insertSymbol(new Attributes(varName, Type.Number));
                    params += "int " + varName;
                    paramNames.add(varName);
                }
            }
            if(ctx.declaration(i).textDec != null) {
                varName = ctx.declaration(i).textDec.textID.getText();
                if(symbolTable.isInScope(new Attributes(varName, Type.Text))) {
                    System.err.println("Error: variable name is already in use");
                    //Throw error
                } else {
                    symbolTable.insertSymbol(new Attributes(varName, Type.Text));
                    params += "char " + varName + "[]";
                    paramNames.add(varName);
                }
            }
            if(ctx.declaration(i).boolDec != null) {
                varName = ctx.declaration(i).boolDec.boolID.getText();
                if (symbolTable.isInScope(new Attributes(varName, Type.Boolean))) {
                    System.err.println("Error: variable name is already in use");
                    //Throw error
                } else {
                    symbolTable.insertSymbol(new Attributes(varName, Type.Boolean));
                    params += "bool " + varName;
                    paramNames.add(varName);
                }
            }
        }

        return params;
    }

    public ArrayList<String> getParamNames(){
        return paramNames;
    }
}
