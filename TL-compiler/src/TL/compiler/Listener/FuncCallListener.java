package TL.compiler.Listener;

import TL.compiler.CodeGen.Visitors.FuncInParam;
import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLBaseListener;
import TL.parser.TLParser;

import java.util.ArrayList;

public class FuncCallListener extends TLBaseListener {

    public FuncDecListener funcDecListener;
    public SymbolTable symbolTable;
    public FuncInParam funcInParam = new FuncInParam();

    public FuncCallListener(FuncDecListener f, SymbolTable s){
        this.funcDecListener = f;
        this.symbolTable = s;
    }

    @Override
    public void enterFuncDec(TLParser.FuncDecContext ctx) {
        symbolTable.openScope();
        super.enterFuncDec(ctx);
    }

    @Override
    public void exitFuncDec(TLParser.FuncDecContext ctx) {
        symbolTable.closeScope();
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
        /**** NOT FINISHED, MISSED A VARIABLE LISTENER TO CHECK IF INPUT VARIABLE IS DECLARED ****/

        // checks if variable is declared
        funcInParam.visitInputParam(ctx, symbolTable);

        ArrayList<String> outParamName = funcDecListener.paramListener.getParamsName();
        ArrayList<String> inParamName = funcInParam.getParamNames();


        for(int i = 0; i < ctx.ID().size(); i++) {

            if(inParamName.size() != outParamName.size()){
                // throw error
                System.err.println("Error: number of parameters in the function call does not match the number" +
                        "of parameters in the function declaration");
            } else {
                Type outParamType = symbolTable.retrieveSymbol(outParamName.get(i)).getType();
                Type inParamType = symbolTable.retrieveSymbol(inParamName.get(i)).getType();

                // checks if the variable in the call, matches the type from the declaration
                    if(inParamType != outParamType) {
                        // throw error
                        System.err.println("Error: type of variable " + ctx.ID(i).getText()
                                + " does not match type of variable " + outParamName.get(i));
                    } else {
                    // throw error
                    System.err.println("Error: input parameter: " + ctx.ID(i).getText() + " is not declared");
                }
            }
        }
    }

}
