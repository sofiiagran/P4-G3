package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class AssignList {
    public String visitAssignmentList(TLParser.AssignListContext ctx, SymbolTable symbolTable) {

        String varName = ctx.assignID.getText();
        String listName = ctx.indexID.getText();
        String listVar = ctx.indexID.getText() + "[" + ctx.NUMBER_VAL_INT().getText() + "]";

        Attributes var1Symbol = new Attributes(varName, null);
        Attributes var2Symbol = new Attributes(listName, null);


        if (symbolTable.isInScope(var1Symbol) && symbolTable.isInScope(var2Symbol)) {

            if((symbolTable.retrieveSymbol(varName).getType()
                    == Type.Number && symbolTable.retrieveSymbol(listName).getType() == Type.NumberList)
                    || (symbolTable.retrieveSymbol(varName).getType()
                    == Type.Text && symbolTable.retrieveSymbol(listName).getType() == Type.TextList) ) {
                // is returned if both variables is declared and has the same type
                return "    " + varName + " = " + listVar + ";\n\n";
            } else {
                throw new IllegalArgumentException("Variable: " + varName + " is not of the same data type as" +
                        " variable: " + listName);
            }
        } else if ((!symbolTable.isInScope(var1Symbol)) && symbolTable.isInScope(var2Symbol)) {
            // is returned if only var 2 is declared
            return assignDataType(varName, listVar, symbolTable);
        } else {
            // throws error if variable 2 is not declared
            throw new IllegalArgumentException("Missing variable declaration of: " + listVar);
        }
    }

    public String assignDataType(String undeclaredVar, String declaredVar, SymbolTable symbolTable) {

        // set data type of undeclared variable to data type of the declared variable
        Type dataType = symbolTable.retrieveSymbol(declaredVar).getType();
        symbolTable.insertSymbol(new Attributes(undeclaredVar, dataType));

        // translate data types to C and print result
        if (dataType == Type.NumberList) {
            return "    double " + undeclaredVar + " = " + declaredVar + ";\n";
        }
        else if (dataType == Type.TextList) {
            return "    char * " + undeclaredVar + " = " + declaredVar + ";\n";
        }
        else {
            // throw error
            throw new IllegalArgumentException("Error: cannot find data type of: " + declaredVar);
        }

    }
}
