package TL.compiler.CodeGen.Visitors;

import TL.compiler.CodeGen.TypeChecker.TypeCheckerCon1;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class Condition1 {


    public TypeCheckerCon1 typeCheckerCon1 = new TypeCheckerCon1();
    public String visitCondition1(TLParser.Con1Context ctx, SymbolTable symbolTable) {

        // checks for compatible types
        typeCheckerCon1.typeCheckCon1(ctx, symbolTable);

        // if it passes the check, condition is printed
        String printCondition = ctx.getChild(0).getText();

        for(int i = 1; i < ctx.getChildCount(); i++) {
            printCondition += " " + ctx.getChild(i).getText();
        }
        return printCondition;
    }
}
