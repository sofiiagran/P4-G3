package TL.compiler.Listener;

import TL.compiler.CodeGen.CST;
import TL.compiler.CodeGen.Visitors.*;
import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.parser.TLBaseListener;
import TL.parser.TLBaseVisitor;
import TL.parser.TLParser;

public class GlobalDecListener extends TLBaseListener {
    CST cst = new CST();

    SymbolTable symbolTable;

    String printGlobalDec = "";

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
        cst.numberDec.visitNumberDec(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.numberDec.getDeclaration() + "\n";
        }
    }
    @Override
    public void enterTextDecl(TLParser.TextDeclContext ctx) {
        cst.textDec.visitTextDec(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.textDec.getDeclaration() + "\n";
        }
    }
    @Override
    public void enterBoolDecl(TLParser.BoolDeclContext ctx) {
        cst.boolDec.visitBoolDec(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.boolDec.getDeclaration() + "\n";
        }
    }
    @Override
    public void enterCollectionInstanceDecl(TLParser.CollectionInstanceDeclContext ctx) {
        cst.collectionInstanceDec.visitCollectionInstanceDec(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.collectionInstanceDec.getDeclaration() + "\n";
        }
    }
    @Override
    public void enterNumberListDecl(TLParser.NumberListDeclContext ctx) {
        cst.numberListDec.visitNumberListDec(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.numberListDec.getDeclaration() + "\n";
        }
    }
    @Override
    public void enterTextListDecl(TLParser.TextListDeclContext ctx) {
        cst.textListDec.visitTextListDec(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.textListDec.getDeclaration() + "\n";
        }
    }

    /** Enter initialisations **/
    @Override
    public void enterNumberInit(TLParser.NumberInitContext ctx) {
        cst.numberInit.visitNumberInitialisation(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.numberInit.getInit() + "\n";
        }
    }

    @Override
    public void enterTextInit(TLParser.TextInitContext ctx) {
        cst.textInit.visitTextInitialisation(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.textInit.getInit() + "\n";
        }
    }

    @Override
    public void enterBooleanInit(TLParser.BooleanInitContext ctx) {
        cst.boolInit.visitBoolInitialisation(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.boolInit.getInit() + "\n";
        }
    }
    @Override
    public void enterNumberListInit(TLParser.NumberListInitContext ctx) {
        cst.numberListInit.visitNumberListInitialisation(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.numberListInit.getInitialisation() + "\n";
        }
    }

    @Override
    public void enterTextListInit(TLParser.TextListInitContext ctx) {
        cst.textListInit.visitTextListInitialisation(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.textListInit.getInitialisation() + "\n";
        }
    }

    @Override
    public void enterCollectionDecl(TLParser.CollectionDeclContext ctx) {
        cst.collectionDec.visitCollectionDec(ctx, symbolTable);
    }

    @Override
    public void enterCollectionInitAll(TLParser.CollectionInitAllContext ctx) {
        cst.collectionInitAll.visitCollectionAllInit(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.collectionInitAll.getInit() + "\n";
        }
    }

    @Override
    public void enterCollectionInitBool(TLParser.CollectionInitBoolContext ctx) {
        cst.collectionInitBool.visitCollectionBoolInit(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.collectionInitBool.getInit() + "\n";
        }
    }

    @Override
    public void enterCollectionInitNumber(TLParser.CollectionInitNumberContext ctx) {
        cst.collectionInitNumber.visitCollectionNumberInit(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.collectionInitNumber.getInit() + "\n";
        }
    }

    @Override
    public void enterCollectionInitText(TLParser.CollectionInitTextContext ctx) {
        cst.collectionInitText.visitCollectionTextInit(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.collectionInitText.getInit() + "\n";
        }
    }

    @Override
    public void enterCollectionInitVar(TLParser.CollectionInitVarContext ctx) {
        cst.collectionInitVar.visitCollectionVarInit(ctx, symbolTable);
        // checks if depth is 0, which means that the variable is global
        if(symbolTable.getDepth() == 0) {
            // print the variable if it is global, so that it is declared before code generator is run
            printGlobalDec += cst.collectionInitVar.getInit() + "\n";
        }
    }

    /*** Dot Variables ***/

    @Override
    public void enterDotVariable(TLParser.DotVariableContext ctx) {
        if(ctx.instanceName != null) {
            cst.collectionVal.visitCollectionValue(ctx, symbolTable);
        } else if (ctx.listID != null) {
            cst.indexVal.visitIndexValue(ctx, symbolTable);
        } else if (ctx.askID != null){
            cst.answerVal.visitAnswerValue(ctx, symbolTable);
        }
    }
    /** Enter ask exp, to declare ask ID **/
    @Override
    public void enterAskExp(TLParser.AskExpContext ctx) {
        cst.askExp.visitAskExpr(ctx, symbolTable);
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

    public String getGlobalDec(){
        return this.printGlobalDec;
    }

}

