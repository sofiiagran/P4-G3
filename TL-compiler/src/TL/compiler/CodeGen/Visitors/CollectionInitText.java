package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class CollectionInitText {

    public String visitCollectionTextInit(TLParser.CollectionInitTextContext ctx, SymbolTable symbolTable){
        String instanceName = ctx.collectionInstance.getText();
        String field = ctx.field.getText();

        return  "    strcpy(" + instanceName + "." + field + ", " + ctx.TEXT_VAL().getText() + ");\n";
    }
}
