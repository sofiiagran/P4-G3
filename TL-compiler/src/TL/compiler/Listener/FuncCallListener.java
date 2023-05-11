package TL.compiler.Listener;

import TL.compiler.CodeGen.Visitors.FuncInParam;
import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLBaseListener;
import TL.parser.TLParser;

import javax.print.attribute.Attribute;
import java.util.ArrayList;

public class FuncCallListener extends TLBaseListener {

    public FuncDecListener funcDecListener;
    public SymbolTable symbolTable;
    public FuncInParam funcInParam;

    public FuncCallListener(FuncDecListener f, SymbolTable s){
        this.funcDecListener = f;
        this.symbolTable = s;
    }


    @Override
    public void enterFuncCall(TLParser.FuncCallContext ctx) {
        String funcName = ctx.funcID.getText();
        Attributes funcAtt = new Attributes(ctx.funcID.getText(), null);
        if(!(symbolTable.isInScope(funcAtt))) {
            // Throw error
            System.err.println("Function name: " + funcName + " does not exist");
        }
    }

    @Override
    public void enterFuncInputParam(TLParser.FuncInputParamContext ctx) {

        Type paramType;
        ArrayList<String> paramName = funcDecListener.paramListener.getParamsName();

        for(int i = 0; i < ctx.ID().size(); i++) {

            if(ctx.ID().size() != paramName.size()){
                // throw error
                System.err.println("Error: number of parameters in the function call does not match the number" +
                        "of parameters in the function declaration");
            } else {
                // checks if variable is declared
                if(symbolTable.isInScope(new Attributes(ctx.ID(i).getText(), null))) {
                    paramType = symbolTable.retrieveSymbol(paramName.get(i)).getType();

                    // checks if the variable in the call, matches the type from the declaration
                    if(symbolTable.retrieveSymbol(ctx.ID(i).getText()).getType() != paramType) {
                        // throw error
                        System.err.println("Error: type of variable " + ctx.ID(i).getText()
                                + " does not match type of variable " + paramName.get(i));
                    }
                } else {
                    // throw error
                    System.err.println("Error: input parameter: " + ctx.ID(i).getText() + " is not declared");
                }
            }
        }
    }
}
