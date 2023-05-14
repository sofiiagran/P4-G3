package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

import java.util.ArrayList;

public class FuncInParam {
    ArrayList<String> paramNames = new ArrayList<>();
    public String visitInputParam(TLParser.FuncInputParamContext ctx, SymbolTable symbolTable){
        String params = "";

        /** for(int i = 0; i < ctx.ID().size(); i++) {
         if(i > 0 && i <ctx.ID().size()) {
         params += ", ";
         }
         //Check if variable is declared
         if(symbolTable.isInScope(new Attributes(ctx.ID(i).getText(), null))) {
         params += ctx.ID(i).getText();
         } else {
         // Throw error
         System.err.println("Error: input parameter: " + ctx.ID(i).getText() + " is not declared");
         params = "";
         }
         paramNames.add(ctx.ID(i).getText());
         }
         return params;
         **/
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
}
