package TL.compiler.CodeGen.Visitors;

import TL.compiler.CodeGen.TypeChecker.TypeCheckerCon1;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class Condition1 {


    public TypeCheckerCon1 typeCheckerCon1 = new TypeCheckerCon1();
    public String visitCondition1(TLParser.Con1Context ctx, SymbolTable symbolTable) {

        int numberCount = 0;
        int valCount = 0;
        String printCondition = "";

        // checks for compatible types
        typeCheckerCon1.typeCheckCon1(ctx, symbolTable);

        // if it passes the check, condition is printed
        for (int i = 0; i < ctx.getChildCount(); i++) {

            if (ctx.getChild(i) == ctx.val(numberCount).numberValue()) {
                if (ctx.val(numberCount).numberValue().NUMBER_VAL_INT() != null) {
                    numberCount++;
                    printCondition += " " + ctx.getChild(i).getText() + ".0";
                } else {
                    numberCount++;
                    printCondition += " " + ctx.getChild(i).getText();
                }
            } else {
                printCondition += " " + ctx.getChild(i).getText();
            }
        }
        return printCondition;
    }
}
