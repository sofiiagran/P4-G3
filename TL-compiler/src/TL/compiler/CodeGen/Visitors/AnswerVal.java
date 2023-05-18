package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLParser;

public class AnswerVal {
    public String visitAnswerValue(TLParser.AnswerValContext ctx, SymbolTable symbolTable){
        String askID = ctx.askID.getText();

        // throw error if ask ID does not exist
        if(!(symbolTable.isInScope(new Attributes(askID, null)))){
            throw new IllegalArgumentException("Cannot get answer from value: " + askID + " since it is not declared");
        }
        return askID;
    }
}
