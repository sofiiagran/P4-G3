package TL.compiler.CodeGen.Visitors;

import TL.compiler.CodeGen.TypeChecker.TypeCheckerMathExp1;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class MathExp1 {

    public TypeCheckerMathExp1 typeCheckerMathExp1 = new TypeCheckerMathExp1();
    public String visitMathExpr1(TLParser.MathExp1Context ctx, SymbolTable symbolTable){

        typeCheckerMathExp1.typeCheckMathExp1(ctx, symbolTable);

        String printMathExpr = ctx.getChild(0).getText();

        for(int i = 1; i < ctx.getChildCount(); i++) {

            printMathExpr += " " + ctx.getChild(i).getText();
        }
        return "    " + printMathExpr + "\n\n";
    }
}
