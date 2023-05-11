package TL.compiler.Listener;

import TL.compiler.CodeGen.Visitors.*;
import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLBaseListener;
import TL.parser.TLBaseVisitor;
import TL.parser.TLParser;

public class GlobalDecListener extends TLBaseListener {

    /** public SymbolTable symbolTable;

    public NumberInit numberInit = new NumberInit();
    public TextInit textInit = new TextInit();
    public BoolInit boolInit = new BoolInit();

    public NumberDec numberDec = new NumberDec();
    public TextDec textDec = new TextDec();
    public BoolDec boolDec = new BoolDec();

    @Override
    public void enterStartBody(TLParser.StartBodyContext ctx) {
        symbolTable.openScope();
        super.enterStartBody(ctx);
    }
    @Override
    public void exitStartBody(TLParser.StartBodyContext ctx) {
        symbolTable.closeScope();
    }

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
    public void enterNumberDecl(TLParser.NumberDeclContext ctx) {
        numberDec.visitNumberDec(ctx, symbolTable);
        String varName = numberDec.getVarName();
        symbolTable.retrieveSymbol(varName);

    } **/
}
