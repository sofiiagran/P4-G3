package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class ReturnExp {

    public String visitReturnExpr(TLParser.ReturnExpContext ctx, SymbolTable symbolTable){
        if(ctx.returnVar != null) {

            //Check if variable is declared
            if (symbolTable.isInScope(new Attributes(ctx.returnVar.getText(), null))) {
                return "    return " + ctx.returnVar.getText() + ";" + "\n";
            } else {
                throw new IllegalArgumentException("Error: missing variable declaration of variable: " + ctx.returnVar.getText());
            }
        }
        // add .0 if value is integer
        else if(ctx.returnVal.numberVal.NUMBER_VAL_INT() != null){
            return "    return " + ctx.returnVal.getText() + ".0 ;" + "\n";
        } else {
            return "    return " + ctx.returnVal.getText() + ";" + "\n";
        }
    }
}
