package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class CollectionInitVar {

    String init;

    public String visitCollectionVarInit(TLParser.CollectionInitVarContext ctx, SymbolTable symbolTable){
        String instanceName = ctx.collectionInstance.getText();
        String field = ctx.field.getText();
        String variable = "";

        //throw error if instance name, field or value is not declared
        if(!(symbolTable.isInScope(new Attributes(instanceName, null)))){
            if(!(symbolTable.isInScope(new Attributes(field, null)))){
                throw new IllegalArgumentException("Variable: " + field + " is not declared.");
            }
            throw new IllegalArgumentException("Variable: " + instanceName + " is not declared.");
        }
        if(ctx.variable.ID() != null){
            String varName = ctx.variable.ID().getText();
            if(symbolTable.isInScope(new Attributes(varName, null))){
                variable = varName;
            } else {
                throw new IllegalArgumentException("Variable: " + varName + " is not declared.");
            }
        } else if(ctx.variable.dotVariable() != null){
            String varName = ctx.variable.dotVariable().getChild(0).getText();
            String index = ctx.variable.dotVariable().getChild(2).getText();
            if(symbolTable.isInScope(new Attributes(varName, null))){
                variable = varName + "[" + index + "]";
            } else {
                throw new IllegalArgumentException("Variable: " + varName + " is not declared.");
            }
        }

        //if both is declared, initialisation is printed
        init = "    " + instanceName + "." + field + " = " + variable + ";\n";
        return init + "\n";
    }
    public String getInit() {return this.init;}
}
