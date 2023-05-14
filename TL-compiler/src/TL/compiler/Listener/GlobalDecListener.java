package TL.compiler.Listener;

import TL.compiler.CodeGen.Visitors.*;
import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLBaseListener;
import TL.parser.TLBaseVisitor;
import TL.parser.TLParser;

public class GlobalDecListener extends TLBaseListener {
    NumberInit numberInit = new NumberInit();
    TextInit textInit = new TextInit();
    BoolInit boolInit = new BoolInit();

    NumberDec numberDec = new NumberDec();
    TextDec textDec = new TextDec();
    BoolDec boolDec = new BoolDec();

    public SymbolTable symbolTable;

    public GlobalDecListener(SymbolTable s) {
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

    @Override
    public void enterFuncDec(TLParser.FuncDecContext ctx) {
        symbolTable.openScope();
    }

    @Override
    public void exitFuncDec(TLParser.FuncDecContext ctx) {
        symbolTable.removeScope();
    }

    /** Enter declarations **/
    @Override
    public void enterNumberDecl(TLParser.NumberDeclContext ctx) {
        numberDec.visitNumberDec(ctx, symbolTable);
        String varName = numberDec.getVarName();
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.retrieveSymbol(varName).getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            System.out.println(numberDec.getDeclaration());
        }
    }
    @Override
    public void enterTextDecl(TLParser.TextDeclContext ctx) {
        textDec.visitTextDec(ctx, symbolTable);
        String varName = textDec.getVarName();
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.retrieveSymbol(varName).getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            System.out.println(textDec.getDeclaration());
        }
    }

    @Override
    public void enterBoolDecl(TLParser.BoolDeclContext ctx) {
        boolDec.visitBoolDec(ctx, symbolTable);
        String varName = boolDec.getVarName();
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.retrieveSymbol(varName).getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            System.out.println(boolDec.getDeclaration());
        }
    }

    /** Enter initialisations **/

    @Override
    public void enterNumberInit(TLParser.NumberInitContext ctx) {
        numberInit.visitNumberInitialisation(ctx, symbolTable);
        String varName = numberInit.getVarName();
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.retrieveSymbol(varName).getDepth() == 0 && numberInit.isDeclared() == false) {
            // print the variable if it is global, so that it is declared before code generator is run
            System.out.println(numberInit.getDeclaration());
        }
    }

    @Override
    public void enterTextInit(TLParser.TextInitContext ctx) {
        textInit.visitTextInitialisation(ctx, symbolTable);
        String varName = textInit.getVarName();
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.retrieveSymbol(varName).getDepth() == 0 && textInit.isDeclared() == false) {
            // print the variable if it is global, so that it is declared before code generator is run
            System.out.println(textInit.getDeclaration());
        }
    }

    @Override
    public void enterBooleanInit(TLParser.BooleanInitContext ctx) {
        boolInit.visitBoolInitialisation(ctx, symbolTable);
        String varName = boolInit.getVarName();
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.retrieveSymbol(varName).getDepth() == 0 && boolInit.isDeclared() == false) {
            // print the variable if it is global, so that it is declared before code generator is run
            System.out.println(boolInit.getDeclaration());
        }
    }

    public Boolean isDeclared(String name, int depth){
        Attributes attribute = new Attributes(name, null);
        if(this.symbolTable.isInScope(attribute)){
            if(symbolTable.retrieveSymbol(name).getDepth() <= depth){
                return true;
            } else {
                return false;
            }
        } return false;
    }

}

