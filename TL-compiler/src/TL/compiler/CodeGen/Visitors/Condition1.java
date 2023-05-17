package TL.compiler.CodeGen.Visitors;

import TL.compiler.CodeGen.TypeChecker.TypeCheckerCon1;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class Condition1 {


    public TypeCheckerCon1 typeCheckerCon1 = new TypeCheckerCon1();
    public String visitCondition1(TLParser.Con1Context ctx, SymbolTable symbolTable) {

        int valCount = 0;
        String printCondition = "";

        // checks for compatible types
        typeCheckerCon1.typeCheckCon1(ctx, symbolTable);

        // loop that visit the children and return them
        for (int i = 0; i < ctx.getChildCount(); i++) {
            //checks if the child is an integer, if so add .0
            if (ctx.getChild(i) == ctx.val(valCount)) {
                if (ctx.val(valCount).numberVal != null) {
                    if (ctx.val(valCount).numberVal.NUMBER_VAL_INT() != null) {
                        printCondition += " " + ctx.getChild(i).getText() + ".0";
                    }
                }
                valCount++;
            }
            else {
                printCondition += " " + ctx.getChild(i).getText();
            }
        }
        return printCondition;
    }
}
