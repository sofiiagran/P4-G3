package TL.compiler.CodeGen.Visitors;

import TL.parser.TLParser;

public class MathOp1 {
    public String visitMathOp1(TLParser.MathematicalOperation1Context ctx){
        // translate TL math operations to C operations
        if (ctx.mathOpADD != null) {
            return "+";
        }
        if (ctx.mathOpSUB != null) {
            return "-";
        }
        if (ctx.mathOpMUL != null) {
            return "*";
        }
        if (ctx.mathOpDIV != null) {
            return "/";
        } else {
            // throw error
            System.err.println("Mathematical operation is not recognized");
            return null;
        }
    }
}
