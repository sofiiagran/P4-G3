package TL.compiler.Listener;

import TL.compiler.CodeGen.Visitors.FuncInParam;
import TL.compiler.CodeGen.Visitors.FuncOutParam;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLBaseListener;
import TL.parser.TLParser;

import java.util.ArrayList;

public class ParamListener extends TLBaseListener {
    public FuncOutParam funcOutParam = new FuncOutParam();
    public FuncInParam funcInParam = new FuncInParam();
    public  String inParams;
    public  String outParams;
    public ArrayList<String> inParamsName;
    public ArrayList<String> outParamsName;

    public SymbolTable symbolTable;

    public ParamListener(SymbolTable s){
        this.symbolTable = s;
    }

    @Override
    public void enterBlock(TLParser.BlockContext ctx) {
        symbolTable.openScope();
        super.enterBlock(ctx);
    }

    @Override
    public void exitBlock(TLParser.BlockContext ctx) {
        symbolTable.closeScope();
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
    public void enterFuncOutputParam(TLParser.FuncOutputParamContext ctx) {
        outParams = funcOutParam.visitOutputParam(ctx, symbolTable);
        outParamsName = funcOutParam.getParamNames();
    }

    @Override
    public void enterFuncInputParam(TLParser.FuncInputParamContext ctx) {
        inParams = funcInParam.visitInputParam(ctx, symbolTable);
        inParamsName = funcInParam.getParamNames();
    }
    public String getOutParams(){
        return outParams;
    }
    public String getInParams(){
        return inParams;
    }

    public ArrayList<String> getInParamsName(){
        return inParamsName;
    }
    public ArrayList<String> getOutParamsName(){
        return outParamsName;
    }


}
