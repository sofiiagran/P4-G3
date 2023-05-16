package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

import java.util.ArrayList;

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
        int numberCount = 0;
        int textCount = 0;
        int idCount = 0;
        int addCount = 0;

        ArrayList<String> variableNames = new ArrayList<>();
        String printVarNames = "";
        String val = " \"";

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) == ctx.numberValue(numberCount)) {
                if (ctx.numberValue(numberCount).NUMBER_VAL_INT() != null) {
                    val += ctx.getChild(i).getText() + ".0";
                }
                if (ctx.numberValue(numberCount).NUMBER_VAL_DOUBLE() != null) {
                    val += ctx.getChild(i).getText();
                }
                numberCount++;
            }
            if (ctx.getChild(i) == ctx.TEXT_VAL(textCount)) {
                String newString = ctx.getChild(i).getText();
                val += newString.replace("\"", "");
                textCount++;
            }
            if (ctx.getChild(i) == ctx.ID(idCount)) {
                if (symbolTable.isInScope(new Attributes(ctx.ID(idCount).getText(), null))) {
                    if (symbolTable.retrieveSymbol(ctx.ID(idCount).getText()).getType() == Type.Number) {
                        val += "%lf";
                        variableNames.add(ctx.ID(idCount).getText());
                        idCount++;
                    }
                    else if (symbolTable.retrieveSymbol(ctx.ID(idCount).getText()).getType() == Type.Text) {
                        val += "%s";
                        variableNames.add(ctx.ID(idCount).getText());
                        idCount++;
                    }
                    else if (symbolTable.retrieveSymbol(ctx.ID(idCount).getText()).getType() == Type.Boolean) {
                        val += "%d";
                        variableNames.add(ctx.ID(idCount).getText());
                        idCount++;
                    }
                } else {
                    throw new IllegalArgumentException("Error: missing variable declaration of variable: " + ctx.ID(idCount).getText());
                }
            }

            if (ctx.getChild(i) == ctx.ADD(addCount)) {
                val += " ";
                addCount++;
            }
        }
        for(int i = 0; i < variableNames.size(); i++){
            printVarNames += ", " + variableNames.get(i);
        }
        return val + "\" " + printVarNames;
    }
}
