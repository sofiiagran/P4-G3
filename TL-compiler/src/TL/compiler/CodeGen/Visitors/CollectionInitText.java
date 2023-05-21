package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class CollectionInitText {

    String init;
    public String visitCollectionTextInit(TLParser.CollectionInitTextContext ctx, SymbolTable symbolTable){
        String instanceName = ctx.collectionInstance.getText();
        String field = ctx.field.getText();

        //throw error if instance name or field is not declared
        if(!(symbolTable.isInScope(new Attributes(instanceName, null)))) {
            throw new IllegalArgumentException("Variable: " + instanceName + " is not declared.");
        }
        if (!(symbolTable.isInScope(new Attributes(field, null)))) {
            throw new IllegalArgumentException("Variable: " + field + " is not declared.");
        }

        init =  "    strcpy(" + instanceName + "." + field + ", " + ctx.TEXT_VAL().getText() + ");\n";
        return init + "\n";
    }
    public String getInit() {return this.init;}
}
