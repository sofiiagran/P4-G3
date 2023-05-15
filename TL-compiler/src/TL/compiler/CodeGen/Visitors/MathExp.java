package TL.compiler.CodeGen.Visitors;

import TL.compiler.CodeGen.TypeChecker.TypeCheckerMathExp;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class MathExp {
    TypeCheckerMathExp typeCheckerMathExp1 = new TypeCheckerMathExp();
    public String visitMathExpr(TLParser.MathExpContext ctx, SymbolTable symbolTable){

        String printMathExpr = "";
        Boolean isDeclared;

        String assignIdName = ctx.assignID.getText();

        if (symbolTable.isInScope(new Attributes(assignIdName, null))) {
            isDeclared = true;
        } else {
            symbolTable.insertSymbol(new Attributes(assignIdName, Type.Number));
            isDeclared = false;
        }

        for(int i = 0; i < (ctx.ID().size() - 1); i++){
            typeCheckerMathExp1.typeCheckMathExp1(ctx.ID(i).getText(), ctx.ID(i + 1).getText(), symbolTable);
        }

        if(isDeclared == false){
            if(symbolTable.retrieveSymbol(assignIdName).getType() == Type.Number){
                printMathExpr += "double " + assignIdName;
            }
            else if(symbolTable.retrieveSymbol(assignIdName).getType() == Type.Text){
                printMathExpr += "char " + assignIdName + "[]";
            }
            else if(symbolTable.retrieveSymbol(assignIdName).getType() == Type.Boolean){
                printMathExpr += "bool " + assignIdName;
            }
        } else {
            printMathExpr += ctx.ID(0);
        }
        int numberCount = 0;
        int intCount = 0;

        for (int i = 1; i < ctx.getChildCount(); i++) {

            if (ctx.getChild(i) == ctx.numberValue(numberCount)) {
                if (ctx.numberValue(numberCount).NUMBER_VAL_INT() != null) {
                    intCount++;
                    numberCount++;
                    printMathExpr += " " + ctx.getChild(i).getText() + ".0";
                } else {
                    numberCount++;
                    printMathExpr += " " + ctx.getChild(i).getText();
                }
            } else {
                printMathExpr += " " + ctx.getChild(i).getText();
            }
        }
        return "    " + printMathExpr + "\n";
    }
}
