package TL.compiler.Listener;

import TL.compiler.CodeGen.Visitors.FuncInParam;
import TL.compiler.CodeGen.Visitors.FuncOutParam;
import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLBaseListener;
import TL.parser.TLParser;

import java.util.ArrayList;

public class FuncCallListener extends TLBaseListener {

    public FuncDecListener funcDecListener;
    public ParamListener paramListener;

    @Override
    public void enterBlock(TLParser.BlockContext ctx) {
        paramListener.symbolTable.openScope();
        super.enterBlock(ctx);
    }
    @Override
    public void exitBlock(TLParser.BlockContext ctx) {
        paramListener.symbolTable.closeScope();
    }

    public FuncCallListener(FuncDecListener f, ParamListener p){
        this.funcDecListener = f;
        this.paramListener = p;
    }

    @Override
    public void enterFuncDec(TLParser.FuncDecContext ctx) {
        paramListener.symbolTable.openScope();
        super.enterFuncDec(ctx);
    }

    @Override
    public void exitFuncDec(TLParser.FuncDecContext ctx) {
        paramListener.symbolTable.closeScope();
    }

    @Override
    public void enterFuncCall(TLParser.FuncCallContext ctx) {
        String funcName = ctx.funcID.getText();
        Attributes funcAtt = new Attributes(ctx.funcID.getText(), null);
        if(!(paramListener.symbolTable.isInScope(funcAtt))) {
            // Throw error
            System.err.println("Function name: " + funcName + " does not exist");
        }
    }


    @Override
    public void enterFuncInputParam(TLParser.FuncInputParamContext ctx) {

        // checks if variable is declared - > this is done by code generator
        // funcInParam.visitInputParam(ctx, symbolTable);

        ArrayList<String> outParamName = paramListener.getOutParamsName();
        ArrayList<String> inParamName = paramListener.getInParamsName();


        for(int i = 0; i < inParamName.size(); i++) {

            if(inParamName.size() != outParamName.size()){
                // throw error
                System.err.println("Error: number of parameters in the function call does not match the number" +
                        "of parameters in the function declaration");
            } else {
                Type outParamType = paramListener.symbolTable.retrieveSymbol(outParamName.get(i)).getType();
                Type inParamType = paramListener.symbolTable.retrieveSymbol(inParamName.get(i)).getType();

                // checks if the variable in the call, matches the type from the declaration
                    if(inParamType != outParamType) {
                        // throw error
                        System.err.println("Error: type of variable " + inParamName.get(i)
                                + " does not match type of variable " + outParamName.get(i));
                    } else {
                    // throw error
                    System.err.println("Error: input parameter: " + inParamName.get(i) + " is not declared");
                }
            }
        }
    }

}
