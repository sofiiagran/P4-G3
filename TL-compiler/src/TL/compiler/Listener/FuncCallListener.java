package TL.compiler.Listener;

import TL.compiler.CodeGen.Visitors.FuncInParam;
import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLBaseListener;
import TL.parser.TLParser;

import java.util.ArrayList;

public class FuncCallListener extends TLBaseListener {

    FuncDecListener funcDecListener;
    GlobalDecListener globalDecListener;
    SymbolTable symbolTable;
    String funcName;

    public FuncCallListener(FuncDecListener f, GlobalDecListener g, SymbolTable s){
        this.funcDecListener = f;
        this.globalDecListener = g;
        this.symbolTable = s;
    }

    @Override
    public void enterBlock(TLParser.BlockContext ctx) {
        symbolTable.openScope();
    }
    @Override
    public void exitBlock(TLParser.BlockContext ctx) {
        symbolTable.closeScope();
        symbolTable.hashMap.clear();
    }

    @Override
    public void enterFuncDec(TLParser.FuncDecContext ctx) {
        symbolTable.openScope();
        super.enterFuncDec(ctx);
    }

    @Override
    public void exitFuncDec(TLParser.FuncDecContext ctx) {
        symbolTable.removeScope();
    }

    @Override
    public void enterFuncCall(TLParser.FuncCallContext ctx) {
        funcName = ctx.funcID.getText();
        // throw error if function name is not declared
        if(!(funcDecListener.isDeclared(funcName))) {
            throw new IllegalArgumentException("Function name: " + funcName + " does not exist");
        }
    }

    @Override
    public void enterFuncInputParam(TLParser.FuncInputParamContext ctx) {

        Type outParamType;
        Type inParamType;

        ArrayList<String> outParamName;
        ArrayList<String> inParamName;

        int depth;

        // throw error if there is no params when params are required
        if(ctx.getChildCount() == 0) {
            throw new IllegalArgumentException("Error: missing input parameter in function call");
        }

        // loop that checks variable declared in function call
        for(int i = 0; i < ctx.var().size(); i++) {

            outParamName = funcDecListener.paramListener.getOutParamsName();
            inParamName = funcDecListener.paramListener.getInParamsName();

            //throw error if number of params in function call does not match the one from declaration
            if(inParamName.size() != outParamName.size()) {
                throw new IllegalArgumentException("Error: number of parameters in the function call does not match " +
                        "the number of parameters in the function declaration");
            } else {
                // check if input variables is declared
                if(funcDecListener.isDeclared(funcName)) {
                    depth = symbolTable.retrieveSymbol(funcName).getDepth();

                    if(globalDecListener.isDeclared(inParamName.get(i), depth)){
                        outParamType = symbolTable.retrieveSymbol(outParamName.get(i)).getType();
                        inParamType = symbolTable.retrieveSymbol(inParamName.get(i)).getType();
                        // checks if the variable in the call, matches the type from the declaration
                        if(inParamType != outParamType) {
                            throw new IllegalArgumentException("Error: type of variable " + inParamName.get(i)
                                    + " does not match type of variable " + outParamName.get(i));
                        }
                    } else {
                        throw new IllegalArgumentException(
                                "Error: input parameter: " + inParamName.get(i) + " is not declared");
                    }
                }

            }
        }
    }
}
