package TL.compiler.Listener;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLBaseListener;
import TL.parser.TLParser;

public class FuncDecListener extends TLBaseListener {
    public String FuncPrototype1 = "";

    public ParamListener paramListener;

    public SymbolTable symbolTable;

    public FuncDecListener(ParamListener p, SymbolTable s) {
        this.paramListener = p;
        this.symbolTable = s;
    }

    @Override
    public void enterBlock(TLParser.BlockContext ctx) {
        symbolTable.openScope();
    }
    @Override
    public void exitBlock(TLParser.BlockContext ctx) {
        symbolTable.removeScope();
    }

    public void enterFuncDec(TLParser.FuncDecContext ctx) {

        symbolTable.openScope();
        FuncPrototype1 = ctx.funcName().getText();
        symbolTable.insertSymbol(new Attributes(FuncPrototype1, Type.Void));


        if (ctx.param != null) {
            System.out.println(FuncPrototype1 + "("  + paramListener.getOutParams() + ");");
        } else {
            System.out.println(FuncPrototype1 + "();");
        }

    }

    @Override
    public void exitFuncDec(TLParser.FuncDecContext ctx) {
        symbolTable.removeScope();
    }
    public Boolean isDeclared(String name){
        if(symbolTable.retrieveSymbol(name) != null){
            return true;
        } else {
            return false;
        }
    }
}

