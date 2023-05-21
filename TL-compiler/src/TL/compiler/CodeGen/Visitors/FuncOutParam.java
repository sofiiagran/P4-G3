package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

import java.util.ArrayList;

public class FuncOutParam {

    ArrayList<String> paramNames = new ArrayList<>();

    ArrayList<String> printParams = new ArrayList<>();
    String params;

    public String visitOutputParam(TLParser.FuncOutputParamContext ctx, SymbolTable symbolTable) {
        String varName;
        params = "";

        // loops through the declaration declared in function declaration
        for(int i = 0; i < ctx.declaration().size(); i++) {

            if(i > 0 && i < ctx.declaration().size()) {
                params += ", ";
            }

            // checks if declaration is number
            if(ctx.declaration(i).numberDec != null) {
                varName = ctx.declaration(i).numberDec.numberID.getText();
                //throw error if declared in scope
                if(symbolTable.isInScope(new Attributes(varName, Type.Number))) {
                    throw new IllegalArgumentException("Error: variable name is already in use");
                } else {
                    // adds to symbol table and adds to array
                    symbolTable.insertSymbol(new Attributes(varName, Type.Number));
                    symbolTable.retrieveSymbol(varName).setIsParam(true);
                    params += "double " + varName;
                    paramNames.add(varName);
                }
            }
            // checks if declaration is text
            if(ctx.declaration(i).textDec != null) {
                varName = ctx.declaration(i).textDec.textID.getText();
                //throw error if declared in scope
                if(symbolTable.isInScope(new Attributes(varName, Type.Text))) {
                    throw new IllegalArgumentException("Error: variable name is already in use");
                } else {
                    // adds to symbol table and adds to array
                    symbolTable.insertSymbol(new Attributes(varName, Type.Text));
                    symbolTable.retrieveSymbol(varName).setIsParam(true);
                    params += "char " + varName + "[]";
                    paramNames.add(varName);
                }
            }
            // checks if declaration is text
            if(ctx.declaration(i).boolDec != null) {
                varName = ctx.declaration(i).boolDec.boolID.getText();
                //throw error if declared in scope
                if (symbolTable.isInScope(new Attributes(varName, Type.Boolean))) {
                    throw new IllegalArgumentException("Error: variable name is already in use");
                } else {
                    // adds to symbol table and adds to array
                    symbolTable.insertSymbol(new Attributes(varName, Type.Boolean));
                    symbolTable.retrieveSymbol(varName).setIsParam(true);
                    params += "bool " + varName;
                    paramNames.add(varName);
                }
            }
            if(ctx.declaration(i).numberListDecl() != null){
                varName = ctx.declaration(i).numberListDecl().ID().getText();
                //throw error if declared in scope
                if (symbolTable.isInScope(new Attributes(varName, Type.NumberList))) {
                    throw new IllegalArgumentException("Error: variable name is already in use");
                } else {
                    // adds to symbol table and adds to array
                    symbolTable.insertSymbol(new Attributes(varName, Type.NumberList));
                    symbolTable.retrieveSymbol(varName).setIsParam(true);
                    params += "double " + varName + "[]";
                    paramNames.add(varName);
                }
            }
            if(ctx.declaration(i).textListDecl() != null){
                varName = ctx.declaration(i).textListDecl().ID().getText();
                //throw error if declared in scope
                if (symbolTable.isInScope(new Attributes(varName, Type.TextList))) {
                    throw new IllegalArgumentException("Error: variable name is already in use");
                } else {
                    // adds to symbol table and adds to array
                    symbolTable.insertSymbol(new Attributes(varName, Type.TextList));
                    symbolTable.retrieveSymbol(varName).setIsParam(true);
                    params += "char " + varName +"[][]";
                    paramNames.add(varName);
                }
            }
            if(ctx.declaration(i).collectionInstanceDecl() != null){
                String collectionName = ctx.declaration(i).collectionInstanceDecl().collectionName.getText();
                String instanceName = ctx.declaration(i).collectionInstanceDecl().instanceName.getText();
                //throw error if declared in scope
                if (symbolTable.isInScope(new Attributes(instanceName, Type.Collection))) {
                    throw new IllegalArgumentException("Error: variable name is already in use");
                } else {
                    // adds to symbol table and adds to array
                    symbolTable.insertSymbol(new Attributes(instanceName, Type.Collection));
                    symbolTable.retrieveSymbol(instanceName).setIsParam(true);
                    params += collectionName + " " + instanceName;
                    paramNames.add(instanceName);
                }
            }
        }

        printParams.add(params);
        return params;
    }

    public ArrayList<String> getParams() {
        return printParams;
    }

    public ArrayList<String> getParamNames(){
        return paramNames;
    }

}
