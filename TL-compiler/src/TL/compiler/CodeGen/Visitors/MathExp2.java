package TL.compiler.CodeGen.Visitors;

import TL.compiler.CodeGen.TypeChecker.TypeCheckerMathExp2;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class MathExp2 {
    public TypeCheckerMathExp2 typeCheckerMathExp2 = new TypeCheckerMathExp2();

    public String visitMathExpr2(TLParser.MathExp2Context ctx, SymbolTable symbolTable){
        typeCheckerMathExp2.typeCheckMathExp2(ctx, symbolTable);

        String printMathExpr = ctx.getChild(0).getText();
        for(int i = 1; i < ctx.getChildCount(); i++) {

            printMathExpr += " " + ctx.getChild(i).getText();
        }
        return "    " + printMathExpr + "\n\n";
    }
}
