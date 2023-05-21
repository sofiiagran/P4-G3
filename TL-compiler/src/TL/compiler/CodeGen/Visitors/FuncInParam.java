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
        for(int i = 0; i < ctx.var().size(); i++) {
            if(i > 0 && i <ctx.var().size()) {
                params += ", ";
            }
            if(ctx.var(i).ID() != null){
                params += ctx.var(i).ID().getText();
                paramNames.add(ctx.var(i).ID().getText());
            }
            else if(ctx.var(i).dotVariable() != null){
                params += ctx.var(i).dotVariable().getText();
                paramNames.add(ctx.var(i).dotVariable().getText());
            }
        }
        return params;
    }
    public ArrayList<String> getParamNames(){
        return paramNames;
    }
    public void clearArray() {paramNames.clear();}
}
