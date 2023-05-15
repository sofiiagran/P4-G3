package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class PrintExp {

    public String visitPrintExpr(TLParser.PrintExpContext ctx, SymbolTable symbolTable){
        return "    printf(" + printBody(ctx, symbolTable) + ");" + "\n";
    }

    public String printBody(TLParser.PrintExpContext ctx, SymbolTable symbolTable){
        //need more complex code !!
        String val = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) == ctx.printVal.numberVal.NUMBER_VAL_INT()) {
                val += ctx.getChild(i).getText() + ".0";
            }
            if(ctx.printVar != null) {
                if(symbolTable.isInScope(new Attributes(ctx.printVar.getText(), null))) {
                    val += ctx.getChild(i).getText();
                } else {
                    throw new IllegalArgumentException("Error: missing variable declaration of variable: " + ctx.printVar.getText());
                }
            } else {
                val += ctx.getChild(i).getText();
            }

            if(i >= 0 && i < (ctx.getChildCount() - 1)) { val += " "; }
        }
        return val;
    }
}
