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

        // if first variable is declared, return isDeclared = true, if not add to symbol table and return false
        if (symbolTable.isInScope(new Attributes(assignIdName, null))) {
            isDeclared = true;
        } else {
            symbolTable.insertSymbol(new Attributes(assignIdName, Type.Number));
            isDeclared = false;
        }

        //check for compatible types
        for(int i = 0; i < (ctx.var().size() - 1); i++){
            typeCheckerMathExp1.typeCheckMathExp1(ctx.var(i).getText(), ctx.var(i + 1).getText(), symbolTable);
        }

        // this is returned if it was not declared beforehand (includes data type)
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
            printMathExpr += assignIdName;
        }
        int numberCount = 0;

        //loops through children and add values to string,
        // ignores the first child, since it is already added to string
        for (int i = 1; i < ctx.getChildCount(); i++) {

            if (ctx.getChild(i) == ctx.numberValue(numberCount)) {
                if (ctx.numberValue(numberCount).NUMBER_VAL_INT() != null) {
                    // adds .0 if integer
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
        //return final string
        return "    " + printMathExpr + ";\n";
    }
}
