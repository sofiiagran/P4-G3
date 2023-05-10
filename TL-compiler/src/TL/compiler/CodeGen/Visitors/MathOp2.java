package TL.compiler.CodeGen.Visitors;

import TL.parser.TLParser;

public class MathOp2 {
    public String visitMathOp2(TLParser.MathematicalOperation2Context ctx){
        // translate TL math operations to C operations
        if(ctx.mathOpADD != null) {
            return "+=";
        }
        if(ctx.mathOpSUB != null) {
            return "-=";
        }
        if(ctx.mathOpMUL != null) {
            return "*=";
        }
        if(ctx.mathOpDIV != null) {
            return "/=";
        } else {
            // throw error
            System.err.println("Mathematical operation is not recognized");
            return null;
        }
    }
}
