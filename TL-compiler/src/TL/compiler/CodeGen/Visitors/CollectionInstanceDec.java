package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

import java.util.ArrayList;

public class CollectionInstanceDec {
    String declaration;
    String instanceName;
    String collectionName;
    ArrayList<String> declaredNames = new ArrayList<>();
    public String visitCollectionInstanceDec(TLParser.CollectionInstanceDeclContext ctx, SymbolTable symbolTable){
        collectionName = ctx.collectionName.getText();
        instanceName = ctx.instanceName.getText();

        // throw error if collection is not declared
        if(!(symbolTable.isInScope(new Attributes(collectionName, null)))){
            throw new IllegalArgumentException("Collection: " + collectionName + " is not declared");
        }
        // throw error if instance is declared from before and is not param
        if(symbolTable.isInScope(new Attributes(instanceName, null))
                && symbolTable.retrieveSymbol(instanceName).getIsParam() == false){
            throw new IllegalArgumentException("Duplicated initialisation of variable: " + instanceName);
        } else {
            symbolTable.insertSymbol(new Attributes(instanceName, Type.Collection));
            declaredNames.add(instanceName);
        }


        declaration = collectionName + " " + instanceName + ";";

        // if it is global scope, empty string is returned, since it is printed by globalDecListener
        if (symbolTable.getDepth() == 0) {
            return "";
        } else {
            // return declaration of instance
            return "    struct " + declaration + "\n";
        }
    }
    public String getVarName(){
        return this.instanceName;
    }
    public String getDeclaration() {return this.declaration;}
    public Boolean isDeclared(String instance){
        if(declaredNames.contains(instance)){
            return true;
        }
        return false;
    }
}
