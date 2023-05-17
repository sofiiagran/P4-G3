package TL.compiler.CodeGen.TypeChecker;

import TL.compiler.SymbolTable.Attributes;
import TL.compiler.SymbolTable.SymbolTable;
import TL.compiler.SymbolTable.Type;
import TL.parser.TLLexer;
import TL.parser.TLParser;

public class TypeCheckerCon1 {

    Boolean stringEqual = false;
    public void typeCheckCon1(TLParser.Con1Context ctx, SymbolTable symbolTable) {

        int varCount = 0;
        int valCount = 0;
        // loop that checks for all conditional operations
        for (int i = 0; i < ctx.conditionalOperation().size(); i++) {

            switch (ctx.conditionalOperation(i).getText()) {

                case "==", "?=", "!=", "is not" -> {

                    // checks if it contains an ID/variable
                    if (ctx.ID(varCount) != null) {
                        String leftVar = ctx.ID(varCount).getText();
                        varCount++;
                        // check if the variable is declared
                        if (symbolTable.isInScope(new Attributes(leftVar, null))) {
                            Type leftVarType = symbolTable.retrieveSymbol(leftVar).getType();

                            // creates switch case based on the type of the variable
                            switch (leftVarType){
                                case Number -> {
                                    // checks if there exist a second ID
                                    // (the count increase every time an ID is explored)
                                    if (ctx.ID(varCount) != null) {
                                        String rightVar = ctx.ID(varCount).getText();
                                        varCount++;
                                        // checks if variable is declared
                                        if (symbolTable.isInScope(new Attributes(rightVar, null))) {
                                            Type rightVarType = symbolTable.retrieveSymbol(rightVar).getType();

                                            // throws error if variable is not the same type (not a number)
                                            if (rightVarType != Type.Number) {
                                                throw new IllegalArgumentException(
                                                        "All values must be of same type in conditions");
                                            }

                                        } else {
                                            throw new IllegalArgumentException(
                                                    "Variable: " + rightVar + " is not declared");
                                        }
                                    }
                                    // checks if there is a value
                                    if (ctx.val(valCount) != null) {
                                        // throw error if it is not the same type (not a number)
                                        if (ctx.val(valCount).numberVal == null) {
                                            throw new IllegalArgumentException(
                                                    "All values must be of same type in conditions");
                                        }
                                        valCount++;
                                    }

                                }
                                // does the same for text as for number
                                case Text -> {
                                    if (ctx.ID(varCount) != null) {
                                        String rightVar = ctx.ID(varCount).getText();
                                        varCount++;
                                        if (symbolTable.isInScope(new Attributes(rightVar, null))) {
                                            Type rightVarType = symbolTable.retrieveSymbol(rightVar).getType();
                                            if (rightVarType != Type.Text) {
                                                throw new IllegalArgumentException(
                                                        "All values must be of same type in conditions");
                                            } else {
                                                // this function is called to tell the visitor that there is an
                                                // equal statement with strings
                                                stringEqual = true;
                                                getStringEqual(leftVar, rightVar, ctx.conditionalOperation(i).getText());
                                            }
                                        } else {
                                            throw new IllegalArgumentException(
                                                    "Variable: " + rightVar + " is not declared");
                                        }
                                    }
                                    if (ctx.val(valCount) != null) {
                                        if (ctx.val(valCount).textVal == null) {
                                            throw new IllegalArgumentException(
                                                    "All values must be of same type in conditions");
                                        } else {
                                            // this function is called to tell the visitor that there is an
                                            // equal statement with strings
                                            stringEqual = true;
                                            getStringEqual(leftVar, ctx.val(valCount).getText(),
                                                    ctx.conditionalOperation(i).getText());
                                        }
                                        valCount++;
                                    }
                                }
                                case Boolean -> {
                                    if (ctx.ID(varCount) != null) {
                                        String rightVar = ctx.ID(varCount).getText();
                                        varCount++;
                                        if (symbolTable.isInScope(new Attributes(rightVar, null))) {
                                            Type rightVarType = symbolTable.retrieveSymbol(rightVar).getType();
                                            if (rightVarType != Type.Boolean) {
                                                throw new IllegalArgumentException(
                                                        "All values must be of same type in conditions");
                                            }
                                        } else {
                                            throw new IllegalArgumentException(
                                                    "Variable: " + rightVar + " is not declared");
                                        }
                                    }
                                    if (ctx.val(valCount) != null) {
                                        if (ctx.val(valCount).boolVal == null) {
                                            throw new IllegalArgumentException(
                                                    "All values must be of same type in conditions");
                                        }
                                        valCount++;
                                    }
                                }
                                default -> throw new IllegalArgumentException(
                                        "Type not found by type-checker.");
                            }
                        } else {
                            throw new IllegalArgumentException("Variable: " + leftVar + "is not declared");
                        }
                    }
                    // checks if there is a value
                    if (ctx.val(valCount) != null) {
                        // checks if value is a number
                        if (ctx.val(valCount).numberVal != null) {
                            valCount++;
                            //checks if there exist a variable
                            if (ctx.ID(varCount) != null) {
                                String rightVarName = ctx.ID(varCount).getText();
                                varCount++;
                                if (symbolTable.isInScope(new Attributes(rightVarName, null))) {
                                    // checks if variable is the same type as value (number)
                                    if (symbolTable.retrieveSymbol(rightVarName).getType() != Type.Number) {
                                        throw new IllegalArgumentException(
                                                "All values must be of same type in conditions");
                                    }
                                } else {
                                    throw new IllegalArgumentException(
                                            "Variable: " + rightVarName + " is not declared");
                                }
                            }
                            // checks if there exist another value
                            if (ctx.val(valCount) != null) {
                                // checks if variable is the same type as the other value (number)
                                if (ctx.val(valCount).numberVal == null) {
                                    throw new IllegalArgumentException(
                                            "All values must be of same type in conditions");
                                }
                                valCount++;
                            }
                        }
                    }
                    if (ctx.val(valCount) != null) {
                        //does the same for text
                        if (ctx.val(valCount).textVal != null) {
                            valCount++;
                            if (ctx.ID(varCount) != null) {
                                String rightVarName = ctx.ID(varCount).getText();
                                varCount++;
                                if (symbolTable.isInScope(new Attributes(rightVarName, null))) {
                                    if (symbolTable.retrieveSymbol(rightVarName).getType() != Type.Text) {
                                        throw new IllegalArgumentException(
                                                "All values must be of same type in conditions");
                                    } else {
                                        // this function is called to tell the visitor that there is an
                                        // equal statement with strings
                                        stringEqual = true;
                                        getStringEqual(ctx.val(valCount).getText(), rightVarName,
                                                ctx.conditionalOperation(i).getText());
                                    }
                                } else {
                                    throw new IllegalArgumentException(
                                            "Variable: " + rightVarName + " is not declared");
                                }
                            }
                            if (ctx.val(valCount) != null) {
                                if (ctx.val(valCount).textVal == null) {
                                    throw new IllegalArgumentException(
                                            "All values must be of same type in conditions");
                                } else {
                                    getStringEqual(ctx.val(valCount - 1).getText(), ctx.val(valCount).getText(),
                                            ctx.conditionalOperation(i).getText());
                                }
                                valCount++;
                            }
                        }
                    }
                    //does the same for bool
                    if (ctx.val(valCount) != null) {
                        if (ctx.val(valCount).boolVal != null) {
                            valCount++;
                            if (ctx.ID(varCount) != null) {
                                String rightVarName = ctx.ID(varCount).getText();
                                varCount++;
                                if (symbolTable.isInScope(new Attributes(rightVarName, null))) {
                                    if (symbolTable.retrieveSymbol(rightVarName).getType() != Type.Boolean) {
                                        throw new IllegalArgumentException(
                                                "All values must be of same type in conditions");
                                    }
                                } else {
                                    throw new IllegalArgumentException(
                                            "Variable: " + rightVarName + " is not declared");
                                }
                                if (ctx.val(valCount) != null) {
                                    if (ctx.val(valCount).boolVal == null) {
                                        throw new IllegalArgumentException(
                                                "All values must be of same type in conditions");
                                    }
                                    valCount++;
                                }
                            }
                        }
                    }
                }
                case "<", "<=", ">", ">=" -> {
                    //checks if there is a variable
                    if (ctx.ID(varCount) != null) {
                        String leftVar = ctx.ID(varCount).getText();
                        varCount++;
                        if (symbolTable.isInScope(new Attributes(leftVar, null))) {
                            Type leftVarType = symbolTable.retrieveSymbol(leftVar).getType();
                            //if it is declared, there is a switch statement based on it's type
                            switch (leftVarType) {
                                case Number -> {
                                    //checks if there is another variable
                                    if (ctx.ID(varCount) != null) {
                                        String rightVar = ctx.ID(varCount).getText();
                                        varCount++;
                                        if (symbolTable.isInScope(new Attributes(rightVar, null))) {
                                            Type rightVarType = symbolTable.retrieveSymbol(rightVar).getType();
                                            //throw error if the type is not a number
                                            if (rightVarType != Type.Number) {
                                                throw new IllegalArgumentException(
                                                        "All values must be of type number for operators:" +
                                                                "\"<\", \"<=\", \">\", \">=\" ");
                                            }
                                        } else {
                                            throw new IllegalArgumentException(
                                                    "Variable: " + rightVar + " is not declared");
                                        }
                                    }
                                    //checks if there is another value
                                    if (ctx.val(valCount) != null) {
                                        if (ctx.val(valCount).numberVal == null) {
                                            //throw error if type is not a number
                                            throw new IllegalArgumentException(
                                                    "All values must be of type number for operators:" +
                                                            "\"<\", \"<=\", \">\", \">=\" ");
                                        }
                                        valCount++;
                                    }
                                }
                                case Text, Boolean -> {
                                    throw new IllegalArgumentException(
                                            "All values must be of type number for operators:" +
                                                    "\"<\", \"<=\", \">\", \">=\" ");
                                }
                                default -> throw new IllegalArgumentException("Type not found by type-checker.");
                            }
                        } else {
                            throw new IllegalArgumentException(
                                    "Variable: " + leftVar + " is not declared");
                        }
                    }
                    // does the same if next child was a value
                    if (ctx.val(valCount) != null) {
                        if (ctx.val(valCount).numberVal != null) {
                            valCount++;
                            if (ctx.ID(varCount) != null) {
                                String rightVarName = ctx.ID(varCount).getText();
                                varCount++;
                                if (symbolTable.isInScope(new Attributes(rightVarName, null))) {
                                    if (symbolTable.retrieveSymbol(rightVarName).getType() != Type.Number) {
                                        throw new IllegalArgumentException(
                                                "All values must be of type number for operators:" +
                                                        "\"<\", \"<=\", \">\", \">=\" ");
                                    }
                                } else {
                                    throw new IllegalArgumentException(
                                            "Variable: " + rightVarName + " is not declared");
                                }
                            }
                            if (ctx.val(valCount) != null) {
                                if (ctx.val(valCount).numberVal == null) {
                                    throw new IllegalArgumentException(
                                            "All values must be of type number for operators:" +
                                                    "\"<\", \"<=\", \">\", \">=\" ");
                                }
                                valCount++;
                            }
                        } else {
                            throw new IllegalArgumentException(
                                    "All values must be of type number for operators:" +
                                            "\"<\", \"<=\", \">\", \">=\" ");
                        }
                    }
                }
            }
        }
    }

        public String getStringEqual (String string1, String string2, String operator){
            String condition = "";

            if (operator == "==" || operator == "?=") {
                condition = "strcmp(" + string1 + ", " + string2 + ") == 0";
            }
            if (operator == "!=" || operator == "is not") {
                condition = "strcmp(" + string1 + ", " + string2 + ") != 0";
            }
            return condition;
        }
}
