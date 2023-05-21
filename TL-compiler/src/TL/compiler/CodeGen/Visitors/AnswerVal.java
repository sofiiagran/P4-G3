package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class AnswerVal {


    public String visitAnswerValue(TLParser.DotVariableContext ctx, SymbolTable symbolTable){

        String askID = ctx.askID.getText();
        String answerVal = askID + "." + ctx.ANSWER().getText();

        // throw error if ask ID does not exist
        if(!(symbolTable.isInScope(new Attributes(askID, null)))) {
            throw new IllegalArgumentException("Cannot get answer from value: " + askID + " since it is not declared");
        }
        symbolTable.insertSymbol(new Attributes(answerVal, Type.Text));
        return askID;
    }
}
