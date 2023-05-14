package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class ReturnExp {

    public String visitReturnExpr(TLParser.ReturnExpContext ctx, SymbolTable symbolTable){
        if(ctx.returnVar != null) {

            //Check if variable is declared
            if(symbolTable.isInScope(new Attributes(ctx.returnVar.getText(), null))) {
                return "    return " + ctx.returnVar.getText() + ";" + "\n\n";
            } else {
                System.err.println("Error: missing variable declaration of variable: " + ctx.returnVar.getText());
                //Throw error here
                return "";
            }
        } else {
            return "    return " + ctx.returnVal.getText() + ";" + "\n\n";
        }
    }
}
