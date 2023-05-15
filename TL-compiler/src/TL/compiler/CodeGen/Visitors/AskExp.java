package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class AskExp {

    public String visitAskExpr(TLParser.AskExpContext ctx, SymbolTable symbolTable){
        String varName = ctx.askID.getText();
        // Check if the variable name exists in the symbol table
        if (symbolTable.isInScope(new Attributes(varName, Type.Text))) {
            return  "    char temp;" +
                    "\n    printf(" + printBody(ctx, symbolTable) + ");" +
                    "\n    scanf(" + "\"%c\"" + "&temp);" +
                    "\n    " + "scanf(" + "\"%[^\\n]\"" + ", " + varName + ");" +
                    "\n\n";

        } else {
            symbolTable.insertSymbol(new Attributes(varName, Type.Text));
            return  "    char " + varName + "[];" +
                    "\n    char temp;" +
                    "\n    printf(" + printBody(ctx, symbolTable) + ");" +
                    "\n    scanf(" + "\"%c\"" + "&temp);" +
                    "\n    " + "scanf(" + "\"%[^\\n]\"" + ", " + varName + ");" +
                    "\n\n";
        }
    }
    public String printBody(TLParser.AskExpContext ctx, SymbolTable symbolTable){
        //need more complex code !!
        String val = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
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
