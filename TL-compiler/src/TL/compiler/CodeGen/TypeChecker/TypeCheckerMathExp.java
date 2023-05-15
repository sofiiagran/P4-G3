package TL.compiler.CodeGen.TypeChecker;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;

public class TypeCheckerMathExp {

    public void typeCheckMathExp1(String var1, String var2, SymbolTable symbolTable) {
        if(symbolTable.isInScope(new Attributes(var1, null))
                && symbolTable.isInScope(new Attributes(var2, null))){
            if(symbolTable.retrieveSymbol(var1).getType() != Type.Number ||
                    symbolTable.retrieveSymbol(var2).getType() != Type.Number){
                throw new IllegalArgumentException("All values must be of type number in math expressions");
            }
        } else {
            throw new IllegalArgumentException("All variables must be declared before using them in an math expression");
        }
    }

}