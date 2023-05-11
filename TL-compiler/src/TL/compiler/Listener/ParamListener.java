package TL.compiler.Listener;

import TL.compiler.CodeGen.Visitors.FuncOutParam;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLBaseListener;
import TL.parser.TLParser;

import java.util.ArrayList;

public class ParamListener extends TLBaseListener {
    public FuncOutParam funcOutParam = new FuncOutParam();
    public  String params;
    public ArrayList<String> paramsName;

    public SymbolTable symbolTable = new SymbolTable();

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
        params = funcOutParam.visitOutputParam(ctx, symbolTable);
        paramsName = funcOutParam.getParamNames();
    }

    public String getParams(){
        return params;
    }

    public ArrayList<String> getParamsName(){
        return paramsName;
    }


}
