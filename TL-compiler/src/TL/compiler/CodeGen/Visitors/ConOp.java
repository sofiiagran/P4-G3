package TL.compiler.CodeGen.Visitors;

import TL.parser.TLParser;

public class ConOp {
    public String visitConOp(TLParser.ConditionalOperationContext ctx){
        // translate TL conditional operations to C operations
        if(ctx.conOpLT != null) {
            return "<";
        }
        if(ctx.conOpLE != null) {
            return "<=";
        }
        if(ctx.conOpGT != null) {
            return ">";
        }
        if(ctx.conOpGE != null) {
            return ">=";
        }
        if(ctx.conOpEQ != null) {
            return "==";
        }
        if(ctx.conOpNEQ != null) {
            return "!=";
        } else {
            // throw error
            throw new IllegalArgumentException("Conditional operation is not recognized");
        }
    }
}
