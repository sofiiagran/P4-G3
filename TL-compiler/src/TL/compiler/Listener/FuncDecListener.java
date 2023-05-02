package TL.compiler.Listener;

import TL.parser.TLBaseListener;
import TL.parser.TLParser;

import java.io.Console;

public class FuncDecListener extends TLBaseListener {
    public String FuncPrototype1 = "";

    public void enterFuncDec(TLParser.FuncDecContext ctx) {
        FuncPrototype1 = ctx.funcID.getText();
        System.out.println(FuncPrototype1 + "();");
    }

}

