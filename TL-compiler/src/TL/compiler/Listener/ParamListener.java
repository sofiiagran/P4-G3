package TL.compiler.Listener;

import TL.compiler.CodeGen.Visitors.FuncInParam;
import TL.compiler.CodeGen.Visitors.FuncOutParam;
import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLBaseListener;
import TL.parser.TLParser;

import java.util.ArrayList;

public class ParamListener extends TLBaseListener {
    public FuncOutParam funcOutParam = new FuncOutParam();
    public FuncInParam funcInParam = new FuncInParam();
    public  String outParams;
    public  String inParams;
    public ArrayList<String> outParamsName;
    public ArrayList<String> inParamsName;

    public SymbolTable symbolTable;
    String lmao;

    public ParamListener(SymbolTable s) {
        symbolTable = s;
    }

    @Override
    public void enterBlock(TLParser.BlockContext ctx) {
        symbolTable.openScope();
    }
    @Override
    public void exitBlock(TLParser.BlockContext ctx) {
        symbolTable.removeScope();
    }

    @Override
    public void enterFuncDec(TLParser.FuncDecContext ctx) {
        symbolTable.openScope();
    }

    @Override
    public void exitFuncDec(TLParser.FuncDecContext ctx) {
        symbolTable.removeScope();
    }

    @Override
    public void enterFuncOutputParam(TLParser.FuncOutputParamContext ctx) {
        // saves output params
        outParams = funcOutParam.visitOutputParam(ctx, symbolTable);

        outParamsName = funcOutParam.getParamNames();
    }


    @Override
    public void enterFuncInputParam(TLParser.FuncInputParamContext ctx) {
        // saves input params
        inParams = funcInParam.visitInputParam(ctx, symbolTable);
        inParamsName = funcInParam.getParamNames();
    }


    public String getOutParams(){
        return outParams;
    }
    public String getInParams(){
        return inParams;
    }

    public ArrayList<String> getOutParamsName(){
        return outParamsName;
    }
    public ArrayList<String> getInParamsName(){
        return inParamsName;
    }
    public void clearParams() {
        funcOutParam.clearParams();}

}
