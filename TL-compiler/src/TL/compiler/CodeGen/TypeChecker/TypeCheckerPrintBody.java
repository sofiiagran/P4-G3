package TL.compiler.CodeGen.TypeChecker;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;

import java.util.ArrayList;

public class TypeCheckerPrintBody {

    public String checkType(String variable, SymbolTable symbolTable){
        String val = "";

        if (symbolTable.isInScope(new Attributes(variable, null))) {
            // print different base on type of the variable + adds variable to an array
            if (symbolTable.retrieveSymbol(variable).getType() == Type.Number) {
                val += "%lf";
            }
            else if (symbolTable.retrieveSymbol(variable).getType() == Type.Text) {
                val += "%s";
            }
            else if (symbolTable.retrieveSymbol(variable).getType() == Type.Boolean) {
                val += "%d";
            }
        } else {
            throw new IllegalArgumentException("Error: missing variable declaration of variable: " + variable);
        }
        return val;
    }
}
