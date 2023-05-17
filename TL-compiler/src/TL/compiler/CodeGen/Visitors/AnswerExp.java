package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class AnswerExp {
    public String visitAnswerExp(TLParser.AnswerValContext ctx){
        return ctx.askID.getText();
    }
}
