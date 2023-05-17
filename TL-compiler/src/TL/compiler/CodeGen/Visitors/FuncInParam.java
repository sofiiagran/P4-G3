package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

import java.util.ArrayList;

public class FuncInParam {
    ArrayList<String> paramNames = new ArrayList<>();
    public String visitInputParam(TLParser.FuncInputParamContext ctx, SymbolTable symbolTable){
        String params = "";

        // loops through variables and add them to an array as well as returning them as a string
        for(int i = 0; i < ctx.ID().size(); i++) {
            if(i > 0 && i <ctx.ID().size()) {
                params += ", ";
            }
            params += ctx.ID(i).getText();
            paramNames.add(ctx.ID(i).getText());
        }
        return params;
    }
    public ArrayList<String> getParamNames(){
        return paramNames;
    }
    public void clearArray() {paramNames.clear();}
}
