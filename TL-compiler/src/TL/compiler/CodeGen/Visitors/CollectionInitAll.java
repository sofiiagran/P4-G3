package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class CollectionInitAll {

    CollectionInstanceDec collectionInstanceDec = new CollectionInstanceDec();

    String init;

    public String visitCollectionAllInit(TLParser.CollectionInitAllContext ctx, SymbolTable symbolTable){
        String collectionName = ctx.collectionName.getText();
        String instanceName = ctx.instanceName.getText();
        String values = "";

        int valCount = 0;
        int commaCount = 0;
        int varCount = 0;

        //check if instance name is declared
        if(symbolTable.isInScope(new Attributes(instanceName, null))
                && !collectionInstanceDec.isDeclared(instanceName) ){
            throw new IllegalArgumentException("Variable name: " + instanceName + " is already in use" +
                    " and can therefore not be used to create instance of collection: " + collectionName);
        } else {
            symbolTable.insertSymbol(new Attributes(instanceName, Type.Collection));
        }

        //loops through children
        for(int i = 0; i < ctx.getChildCount(); i++) {
            //check if child is value
            if(ctx.getChild(i) == ctx.val(valCount)) {
                //check if it is a number value
                if (ctx.val(valCount).numberVal != null) {
                    // check if it is an integer
                    if (ctx.val(valCount).numberVal.NUMBER_VAL_INT() != null) {
                        values += ctx.val(valCount).numberVal.NUMBER_VAL_INT().getText()
                                + ".0";
                        // check if it is double
                    } else if (ctx.val(valCount).numberVal.NUMBER_VAL_DOUBLE() != null) {
                        values += ctx.val(valCount).numberVal.NUMBER_VAL_DOUBLE().getText();
                    }
                }
                // check if it is a text value
                else if (ctx.val(valCount).textVal != null) {
                    values += ctx.val(valCount).textVal.getText();
                }
                // check if it is a boolean value
                else if (ctx.val(valCount).boolVal != null) {
                    values += ctx.val(valCount).boolVal.getText();
                }
                valCount++;
            }
            // check if it is a variable
            else if(ctx.getChild(i) == ctx.var(varCount)){
                if(ctx.var(varCount).ID() != null) {
                    String varName = ctx.var(varCount).ID().getText();
                    if(varName != ctx.instanceName.getText()){
                        if(symbolTable.isInScope(new Attributes(varName, null))){
                            values += varName;
                        } else {
                            //throw error if variable is not declared
                            throw new IllegalArgumentException("Variable: " + varName + " is not declared.");
                        }
                    }
                }else if (ctx.var(varCount).dotVariable() != null) {
                    String varName;
                    if (ctx.var(varCount).dotVariable().instanceName != null) {
                        varName = ctx.var(varCount).dotVariable().instanceName.getText();
                        String field = ctx.var(varCount).dotVariable().field.getText();
                        if (symbolTable.isInScope(new Attributes(varName, null))) {
                            values += varName + "." + field;
                        } else {
                            //throw error if variable is not declared
                            throw new IllegalArgumentException("Variable: " + varName + " is not declared.");
                        }
                    } else if (ctx.var(varCount).dotVariable().askID != null) {
                        varName = ctx.var(varCount).dotVariable().askID.getText();
                        if (symbolTable.isInScope(new Attributes(varName, null))) {
                            values += varName;
                        } else {
                            //throw error if variable is not declared
                            throw new IllegalArgumentException("Variable: " + varName + " is not declared.");
                        }
                    } else if (ctx.var(varCount).dotVariable().listID != null) {
                        varName = ctx.var(varCount).dotVariable().listID.getText();
                        if (symbolTable.isInScope(new Attributes(varName, null))) {
                            values += varName + "[" + ctx.var(varCount).dotVariable().NUMBER_VAL_INT() + "]";
                        } else {
                            //throw error if variable is not declared
                            throw new IllegalArgumentException("Variable: " + varName + " is not declared.");
                        }
                    }
                    varCount++;
                }
            // add ", " if child is a comma
            } else if (ctx.getChild(i) == ctx.COMMA(commaCount))  {
                values += ", ";
                commaCount++;
            }
        }
        init = "    struct " + collectionName + " " + instanceName + " = {" + values + "};";
        return init + "\n";
    }
    public String getInit() {return this.init;}
}
