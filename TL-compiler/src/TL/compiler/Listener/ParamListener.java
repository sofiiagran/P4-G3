package TL.compiler.Listener;

import TL.parser.TLBaseListener;
import TL.parser.TLParser;

public class ParamListener extends TLBaseListener {

    /**

    public String param = "";
    @Override
    public void enterFuncOutputParam(TLParser.FuncOutputParamContext ctx) {
        String firstVal = "";
        String print = "";

        if (ctx.getChild(0) == ctx.decB) {
            firstVal = "bool " + ctx.decB.getChild(1);
        }
        if (ctx.getChild(0) == ctx.decN) {
            firstVal = "int " + ctx.decN.getChild(1);
        }
        if (ctx.getChild(0) == ctx.decT) {
            firstVal = "char " + ctx.decT.getChild(1);
        }


        for(int i = 1; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) == ctx.decB) {
                print += ", bool " + ctx.decB.getChild(i);
            }
            if (ctx.getChild(i) == ctx.decN) {
                print += ", int " + ctx.decN.getChild(i);
            }
            if (ctx.getChild(i) == ctx.decT) {
                print += ", char " + ctx.decT.getChild(i) + "[]";
            }
        }

        param = firstVal + print;
    }

    public String getParam() {
        return param;
    }
    **/


}
