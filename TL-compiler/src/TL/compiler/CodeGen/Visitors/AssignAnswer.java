package TL.compiler.CodeGen.Visitors;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLParser;

public class AssignAnswer {

    public String visitAssignmentAnswer(TLParser.AssignAnswerContext ctx, SymbolTable symbolTable) {

        String var1Name = ctx.assignID.getText();
        String var2Name = ctx.askID.getText() + "." + ctx.ANSWER().getText();

        Attributes var1Symbol = new Attributes(var1Name, null);
        Attributes var2Symbol = new Attributes(var2Name, null);


        if (symbolTable.isInScope(var1Symbol) && symbolTable.isInScope(var2Symbol)) {
            if(symbolTable.retrieveSymbol(var1Name).getType()
                    == symbolTable.retrieveSymbol(var2Name).getType()){
                // is returned if both variables is declared and has the same type
                return "    " + var1Name + " = " + var2Name + ";\n\n";
            } else {
                throw new IllegalArgumentException("Variable: " + var1Name + " is not of the same data type as" +
                        " variable: " + var2Name);
            }
        } else if ((!symbolTable.isInScope(var1Symbol)) && symbolTable.isInScope(var2Symbol)) {
            // is returned if only var 2 is declared
            return assignDataType(var1Name, var2Name, symbolTable);
        } else {
            // throws error if variable 2 is not declared
            throw new IllegalArgumentException("Missing variable declaration of: " + var2Name);
        }
    }

    public String assignDataType(String undeclaredVar, String declaredVar, SymbolTable symbolTable) {

        // set data type of undeclared variable to data type of the declared variable
        Type dataType = symbolTable.retrieveSymbol(declaredVar).getType();
        symbolTable.insertSymbol(new Attributes(undeclaredVar, dataType));

        // translate data types to C and print result
        if (dataType == Type.Number) {
            return "    double " + undeclaredVar + " = " + declaredVar + ";\n";
        }
        if (dataType == Type.Text) {
            return "    char * " + undeclaredVar + " = " + declaredVar + ";\n";
        }
        if (dataType == Type.Boolean) {
            return "    bool " + undeclaredVar + " = " + declaredVar + ";\n";
        } else {
            // throw error
            throw new IllegalArgumentException("Error: cannot find data type of: " + declaredVar);
        }

    }

}
