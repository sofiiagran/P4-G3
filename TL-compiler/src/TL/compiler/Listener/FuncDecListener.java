package TL.compiler.Listener;

import TL.compiler.CodeGen.Visitors.FuncOutParam;
import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLBaseListener;
import TL.parser.TLParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.Console;

public class FuncDecListener extends TLBaseListener {
    public String FuncPrototype1 = "";

    public ParamListener paramListener;

    public SymbolTable symbolTable;

    public FuncDecListener(ParamListener p, SymbolTable s) {
        this.paramListener = p;
        this.symbolTable = s;
    }
    public void enterFuncDec(TLParser.FuncDecContext ctx) {

        symbolTable.openScope();

        FuncPrototype1 = ctx.funcName().getText();
        symbolTable.insertSymbol(new Attributes(FuncPrototype1, Type.Void));


        if (ctx.param != null) {
            System.out.println(FuncPrototype1 + "("  + paramListener.getParams() + ");");
        } else {
            System.out.println(FuncPrototype1 + "();");
        }

        symbolTable.closeScope();

    }


}

