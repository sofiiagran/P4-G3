package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

import java.util.ArrayList;

public class FuncInParam {
    String params = "";
    ArrayList<String> paramNames = new ArrayList<>();


    public String visitInputParam(TLParser.FuncInputParamContext ctx, SymbolTable symbolTable) {


        for (int i = 0; i < ctx.ID().size(); i++) {
                if (i > 0 && i < ctx.ID().size()) {
                    params += ", ";
                }
                // checks if variable is declared
                if (symbolTable.isInScope(new Attributes(ctx.ID(i).getText(), null))) {
                        params += ctx.ID(i).getText();
                        paramNames.add(ctx.ID(i).getText());

                    } else {
                    // throws error if variable is not declared
                    System.err.println("Error: input parameter: " + ctx.ID(i).getText() + " is not declared");

                }
            }
        return params;
    }

    public ArrayList<String> getParamNames() {
            return this.paramNames;
    }
}
