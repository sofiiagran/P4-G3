package TL.compiler.CodeGen.Visitors;

import TL.parser.TLParser;

import java.util.ArrayList;

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
    public String visitConditionOp(TLParser.Con1Context ctx, int count){

        // translate TL conditional operations to C operations
        if(ctx.conditionalOperation(count).conOpLT != null) {
            return "<";
        }
        if(ctx.conditionalOperation(count).conOpLE != null) {
            return "<=";
        }
        if(ctx.conditionalOperation(count).conOpGT != null) {
            return ">";
        }
        if(ctx.conditionalOperation(count).conOpGE != null) {
            return ">=";
        }
        if(ctx.conditionalOperation(count).conOpEQ != null) {
            return "==";
        }
        if(ctx.conditionalOperation(count).conOpNEQ != null) {
            return "!=";
        } else {
            // throw error
            throw new IllegalArgumentException("Conditional operation is not recognized");
        }
    }
}
