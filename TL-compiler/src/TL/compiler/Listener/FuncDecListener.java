package TL.compiler.Listener;

import TL.compiler.CodeGen.Visitors.FuncDec;
import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLBaseListener;
import TL.parser.TLParser;

public class FuncDecListener extends TLBaseListener {
    String FuncPrototype1 = "";
    ParamListener paramListener;
    SymbolTable symbolTable;
    String printPrototypes = "";
    String returnType;

    FuncDec funcDec = new FuncDec();

    public FuncDecListener(ParamListener p, SymbolTable s) {
        this.paramListener = p;
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

    public void enterFuncDec(TLParser.FuncDecContext ctx) {

        symbolTable.openScope();

        // calls function that get return type based on return type (void is default)
        funcDec.getReturnType(ctx, symbolTable);

        //calls function that declare function type (translated to C's data types)
        returnType = funcDec.printReturnType(ctx, symbolTable);

        //adds function name to symbol table
        FuncPrototype1 = ctx.funcName().getText();

        //create declaration to be used for prototypes
        if (ctx.param != null) {
            printPrototypes += returnType + " " + FuncPrototype1 + "("  + paramListener.getOutParams() + ");\n";
        } else {
            printPrototypes += returnType + " " + FuncPrototype1 + "();\n";
        }

    }

    public String getReturnType(TLParser.FuncDecContext ctx) {
        enterFuncDec(ctx);
        return returnType;
    }

    @Override
    public void exitFuncDec(TLParser.FuncDecContext ctx) {
        symbolTable.removeScope();
    }
    public Boolean isDeclared(String name){
        if(symbolTable.retrieveSymbol(name) != null){
            return true;
        } else {
            return false;
        }
    }

    public String getPrototypes(){
        return this.printPrototypes;
    }
}

