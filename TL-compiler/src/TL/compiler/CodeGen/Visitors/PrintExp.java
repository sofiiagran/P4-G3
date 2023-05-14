package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class PrintExp {

    public String visitPrintExpr(TLParser.PrintExpContext ctx, SymbolTable symbolTable){
        return "    printf(" + printBody(ctx, symbolTable) + ");" + "\n\n";
    }

    public String printBody(TLParser.PrintExpContext ctx, SymbolTable symbolTable){
        //need more complex code !!
        String val = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.printVar != null) {
                if(symbolTable.isInScope(new Attributes(ctx.printVar.getText(), null))) {
                    val += ctx.getChild(i).getText();
                } else {
                    System.err.println("Error: missing variable declaration of variable: " + ctx.printVar.getText());
                    //Throw error here
                }
            } else {
                val += ctx.getChild(i).getText();
            }

            if(i >= 0 && i < (ctx.getChildCount() - 1)) { val += " "; }
        }
        return val;
    }
}
