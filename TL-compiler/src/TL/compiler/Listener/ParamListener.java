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

    public SymbolTable symbolTable;

    public ParamListener(SymbolTable s){
        this.symbolTable = s;
    }

    @Override
    public void enterFuncOutputParam(TLParser.FuncOutputParamContext ctx) {
        symbolTable.openScope();
        params = funcOutParam.visitOutputParam(ctx, symbolTable);
        paramsName = funcOutParam.getParamNames();
        symbolTable.closeScope();
    }

    public String getParams(){
        return params;
    }

    public ArrayList<String> getParamsName(){
        return paramsName;
    }


}
