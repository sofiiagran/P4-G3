package TL.compiler.Listener;

import TL.compiler.CodeGen.Visitors.NumberDec;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLBaseListener;
import TL.parser.TLBaseVisitor;
import TL.parser.TLParser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class GlobalDecListener extends TLBaseVisitor {

    SymbolTable symbolTable = new SymbolTable();
    NumberDec numberDec = new NumberDec();

    public String openScope() {
        symbolTable.openScope();
        return "";
    }
    public String closeScope() {
        symbolTable.closeScope();
        return "";
    }

    @Override
    public Object visitStartBody(TLParser.StartBodyContext ctx) {
        for(int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.getChild(i) == ctx.declaration(0).numberDecl()) {
                return visit(ctx.declaration(0).numberDecl());
            }
        }
        return null;
    }

    @Override
    public Object visitNumberDecl(TLParser.NumberDeclContext ctx) {
        System.out.println(ctx.numberID.getText());
        System.out.println(numberDec.visitNumberDec(ctx, symbolTable));

        return numberDec.visitNumberDec(ctx, symbolTable);


    }

}
