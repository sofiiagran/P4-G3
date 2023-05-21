package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class CollectionDec {
    String structPrototype = "";

    public String visitCollectionDec(TLParser.CollectionDeclContext ctx, SymbolTable symbolTable){

        String collectionName = ctx.collectionName.getText();
        String declaration = "";
        String varName;

        int decCount = 0;

        //insert collection name to symbol table
        symbolTable.insertSymbol(new Attributes(collectionName, Type.Collection));

        //loops through children
        for(int i = 0; i < ctx.getChildCount(); i++){
            // check if child is initialisation
            if(ctx.getChild(i) == ctx.declaration(decCount)) {
                if(ctx.declaration(decCount).textDec != null){
                    varName = ctx.declaration(decCount).textDec.textID.getText();
                    // check if variable name is already in use
                    if (symbolTable.isInScope(new Attributes(varName, null))) {
                        throw new IllegalArgumentException("Variable name: " + varName + " is already in use");
                    } else {
                        // if not, it is added to symbol table
                        symbolTable.insertSymbol(new Attributes(varName, Type.Text));
                        symbolTable.retrieveSymbol(varName).setIsParam(true);
                        declaration += "    char " + varName + "[];\n";
                    }
                } else if (ctx.declaration(decCount).numberDec != null){
                    varName = ctx.declaration(decCount).numberDec.numberID.getText();
                    // check if variable name is already in use
                    if (symbolTable.isInScope(new Attributes(varName, null))) {
                        throw new IllegalArgumentException("Variable name: " + varName + " is already in use");
                    } else {
                        // if not, it is added to symbol table
                        symbolTable.insertSymbol(new Attributes(varName, Type.Number));
                        symbolTable.retrieveSymbol(varName).setIsParam(true);
                        declaration += "    double " + varName + ";\n";
                    }
                } else if (ctx.declaration(decCount).boolDec != null) {
                    varName = ctx.declaration(decCount).boolDec.boolID.getText();
                    // check if variable name is already in use
                    if (symbolTable.isInScope(new Attributes(varName, null))) {
                        throw new IllegalArgumentException("Variable name: " + varName + " is already in use");
                    } else {
                        // if not, it is added to symbol table
                        symbolTable.insertSymbol(new Attributes(varName, Type.Boolean));
                        symbolTable.retrieveSymbol(varName).setIsParam(true);
                        declaration += "    bool " + varName + ";\n";
                    }
                }
                decCount++;
            }
        }

        structPrototype +=  "\n struct " + collectionName + " { \n" + declaration + "};\n";
        return "";
    }

    public String getStructPrototype(){
        return structPrototype;
    }
}
