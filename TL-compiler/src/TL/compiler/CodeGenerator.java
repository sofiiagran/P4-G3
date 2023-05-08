package TL.compiler;


import TL.compiler.SymbolTable.*;
import TL.parser.TLBaseVisitor;
import TL.parser.TLLexer;
import TL.parser.TLParser;

public class CodeGenerator extends TLBaseVisitor<String> {


    public SymbolTable symbolTable;


    CodeGenerator(SymbolTable s) {
        this.symbolTable = s;
    }



    // when empty productions are visited, an empty string is returned

    @Override
    protected String defaultResult() {
        return "";
    }

    public String openScope() {
        symbolTable.openScope();
        return "";
    }
    public String closeScope() {
        symbolTable.closeScope();
        return "";
    }

    /*** Start of program ***/

    @Override
    public String visitProgram(TLParser.ProgramContext ctx) {


        return openScope() + visit(ctx.block()) + closeScope();

    }

    @Override
    public String visitBlock(TLParser.BlockContext ctx) {
        //check if it contains a functions block
        if (!(ctx.functionsBlock() == null)) {
            return "\nint main() { " + "\n\n"  + visit(ctx.startBlock()) + "    return 0;\n}" + visit(ctx.functionsBlock())
                    + "}";
        } else {
            return "\nint main() { " + "\n\n" + visit(ctx.startBlock()) + "   return 0;\n}";
        }
    }

    /*** Expressions ***/

    @Override
    public String visitAskExp(TLParser.AskExpContext ctx) {

        String varName = ctx.askID.getText();
        // Check if the variable name exists in the symbol table
        if (symbolTable.isInScope(new Attributes(varName, Type.Text))) {
            return  "    char temp;" +
                    "\n    printf(" + visit(ctx.printBody()) + ");" +
                    "\n    scanf(" + "\"%c\"" + "&temp);" +
                    "\n    " + "scanf(" + "\"%[^\\n]\"" + ", " + varName + ");" +
                    "\n\n";

        } else {
            symbolTable.insertSymbol(new Attributes(varName, Type.Text));
            return  "    char " + varName + "[];" +
                    "\n    char temp;" +
                    "\n    printf(" + visit(ctx.printBody()) + ");" +
                    "\n    scanf(" + "\"%c\"" + "&temp);" +
                    "\n    " + "scanf(" + "\"%[^\\n]\"" + ", " + varName + ");" +
                    "\n\n";
        }
    }

    @Override
    public String visitPrintExp(TLParser.PrintExpContext ctx) {
        return "    printf(" + visit(ctx.printBody()) + ");" + "\n\n";
    }

    @Override
    public String visitPrintBody(TLParser.PrintBodyContext ctx) {

        //need more complex code !!

        String val = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.printVar != null) {
                if(symbolTable.isInScope(new Attributes(ctx.printVar.getText(), null))) {
                    val += ctx.getChild(i).getText();
                } else {
                    System.err.println("Error: missing variable declaration of variable: " + ctx.printVar.getText());
                    //Throw error here
                }
            } else {
                val += ctx.getChild(i).getText() ;
            }
            if(i >= 0 && i < (ctx.getChildCount() - 1)) { val += " "; }
        }
        return val;
    }

    @Override
    public String visitReturnExp(TLParser.ReturnExpContext ctx) {
        if(ctx.returnVar != null) {
            if(symbolTable.isInScope(new Attributes(ctx.returnVar.getText(), null))) {
                return "    return " + ctx.returnVar.getText() + ";" + "\n\n";
            } else {
                System.err.println("Error: missing variable declaration of variable: " + ctx.returnVar.getText());
                //Throw error here
                return "";
            }

        } else {
            return "    return " + ctx.returnVal.getText() + ";" + "\n\n";
        }
    }

    @Override
    public String visitFuncCall(TLParser.FuncCallContext ctx) {
        if(ctx.param != null) {
            return "    " + ctx.funcID.getText() + "(" + visit(ctx.funcInputParam()) + ");" + "\n\n" ;
        }
        return "    " + ctx.funcID.getText() + "();" + "\n\n" ;
    }

    @Override
    public String visitFuncDec(TLParser.FuncDecContext ctx) {

        String print = "";
        String returnType = "";
        String funcName = ctx.funcID.getText();

        getReturnType(ctx);

        openScope();

        if(symbolTable.retrieveSymbol(funcName) != null) {

            if (symbolTable.retrieveSymbol(funcName).getType() == Type.Text) {
                returnType += "const char*";
            }
            if ((symbolTable.retrieveSymbol(funcName).getType()) == Type.Number) {
                returnType += "double";
            }
            if ((symbolTable.retrieveSymbol(funcName).getType()) == Type.Boolean) {
                returnType += "bool";
            }
            if ((symbolTable.retrieveSymbol(funcName).getType()) == Type.Void) {
                returnType += "void";
            }
        }
        if(ctx.param != null) {

            for(int i = 1; i < ctx.funcBody().size(); i++) {
                print += visit(ctx.funcBody(i));
            }
            if (ctx.returnExp() != null) {
                print += visit(ctx.returnExp());
            }

            return "\n\n" + returnType + " " +  ctx.funcID.getText() + "("  + visit(ctx.funcOutputParam()) + ") "
                    + "{ \n\n" + print + "}" + "\n\n" + closeScope();
        }

        return "\n\n" + returnType + " " + ctx.funcID.getText() + "() { \n\n" + visitChildren(ctx)
                + "}" + "\n\n" + closeScope();
    }

    @Override
    public String visitFuncOutputParam(TLParser.FuncOutputParamContext ctx) {

        String params = "";
        String varName;

        for(int i = 0; i < ctx.declaration().size(); i++) {

            if(i > 0 && i < ctx.declaration().size()) {
                params += ", ";
            }

            if(ctx.declaration(i).numberDec != null) {
                varName = ctx.declaration(i).numberDec.numberID.getText();
                if(symbolTable.isInScope(new Attributes(varName, Type.Number))) {
                    System.err.println("Error: variable name is already in use");
                    //Throw error
                }
                params += "int " + varName;
            }
            if(ctx.declaration(i).textDec != null) {
                varName = ctx.declaration(i).textDec.textID.getText();
                if(symbolTable.isInScope(new Attributes(varName, Type.Text))) {
                    System.err.println("Error: variable name is already in use");
                    //Throw error
                }
                params += "char " + varName + "[]";
            }
            if(ctx.declaration(i).boolDec != null) {
                varName = ctx.declaration(i).boolDec.boolID.getText();
                if (symbolTable.isInScope(new Attributes(varName, Type.Boolean))) {
                    System.err.println("Error: variable name is already in use");
                    //Throw error
                }
                params += "bool " + varName;
            }
        }

        return params;

    }
    @Override
    public String visitFuncInputParam(TLParser.FuncInputParamContext ctx) {

        String params = "";

        for(int i = 0; i < ctx.ID().size(); i++) {

            if(i > 0 && i <ctx.ID().size()) {
                params += ", ";
            }

            if(symbolTable.isInScope(new Attributes(ctx.ID(i).getText(), null))) {
                params += ctx.ID(i).getText();
            } else {
                System.err.println("Error: input parameter: " + ctx.ID(i).getText() + " is not declared");
                params = "";
            }

        }
        return params;
    }

    /*** Initialization ***/


    @Override
    public String visitNumberInit(TLParser.NumberInitContext ctx) {

        String varName = ctx.var1ID.getText();
        Type type = Type.Number;
        Attributes attribute = new Attributes(varName, type);

        if(symbolTable.isInScope(attribute)) {
            return "    "  + varName + " = " + ctx.NUMBER_VAL() + ";" + "\n\n";
        } else {
            symbolTable.insertSymbol(attribute);
            return "    double " + varName + " = " + ctx.NUMBER_VAL() + ";" + "\n\n";
        }
    }


    @Override
    public String visitTextInit(TLParser.TextInitContext ctx) {
        String varName = ctx.var1ID.getText();
        Type type = Type.Text;
        Attributes attribute = new Attributes(varName, type);

        if(symbolTable.isInScope(attribute)) {
                return "    "  + ctx.var1ID.getText() + " = " + ctx.TEXT_VAL() + ";" + "\n\n";
            } else {
                symbolTable.insertSymbol(attribute);
                return "    "  + "char " + ctx.var1ID.getText() + "[]" + " = " + ctx.TEXT_VAL() + ";" + "\n\n";
            }
    }

    @Override
    public String visitBooleanInit(TLParser.BooleanInitContext ctx) {

            if(symbolTable.containsSymbol(ctx.var1ID.getText())) {
                return "    " + ctx.var1ID.getText() + " = "+ ctx.BOOL_LITERAL().getText() + ";" + "\n\n";
            } else {
                return "    bool " + ctx.var1ID.getText() + " = "+ ctx.BOOL_LITERAL().getText() + ";" + "\n\n";
            }
    }

    @Override
    public String visitAssignment(TLParser.AssignmentContext ctx) {
        return ctx.var1ID.getText() + " = " + ctx.var2ID.getText();
    }

    /*** Declaration ***/


    @Override
    public String visitNumberDecl(TLParser.NumberDeclContext ctx) {

        String varName = ctx.numberID.getText();
        Type type = Type.Number;
        Attributes attribute = new Attributes(varName, type);

        if(symbolTable.isInScope(attribute)) {
            return "";
        } else {
            symbolTable.insertSymbol(attribute);
            return "    int " + varName + ";" + "\n\n";
        }
    }

    @Override
    public String visitTextDecl(TLParser.TextDeclContext ctx) {
        String varName = ctx.textID.getText();
        Type type = Type.Text;
        Attributes attribute = new Attributes(varName, type);

        if (symbolTable.isInScope(attribute)) {
            return "";
        } else {
            symbolTable.insertSymbol(attribute);
            return "    char " + varName + "[]" + ";" + "\n\n";
        }
    }

    @Override
    public String visitBoolDecl(TLParser.BoolDeclContext ctx) {
        String varName = ctx.boolID.getText();
        Type type = Type.Boolean;
        Attributes attribute = new Attributes(varName, type);

        if (symbolTable.isInScope(attribute)) {
            return "";
        } else {
            symbolTable.insertSymbol(attribute);
            return "    bool " + varName + ";" + "\n\n";
        }
    }

    /*** Statements ***/

    @Override
    public String visitIfThenStatement(TLParser.IfThenStatementContext ctx) {
        return "    if(" + visit(ctx.condition()) + ") { \n\n" + visit(ctx.statementBody()) + "   }" + "\n\n";
    }

    @Override
    public String visitIfThenElseStatement(TLParser.IfThenElseStatementContext ctx) {
        return super.visitIfThenElseStatement(ctx);
    }


    @Override
    public String visitWhileStatement(TLParser.WhileStatementContext ctx) {
        return "    while(" + visit(ctx.condition()) + ") { \n\n" + visit(ctx.statementBody()) + "    }" + "\n\n";
    }

    @Override
    public String visitRepeatStatement(TLParser.RepeatStatementContext ctx) {
        return "    for" + "(" + "int i = 0; " + "i > " + ctx.NUMBER_VAL() + "; " + "i++ ) { \n\n"
                + visit(ctx.statementBody()) + "    }" + "\n\n";
    }

    @Override
    public String visitRepeatUntilStatement(TLParser.RepeatUntilStatementContext ctx) {
        return "    while(!(" + visit(ctx.condition()) + ")) { \n\n" + visit(ctx.statementBody()) + "    }" + "\n\n";
    }


    @Override
    public String visitCon1(TLParser.Con1Context ctx) {
        if(ctx.leftConVal != null) {
            return ctx.leftConVal.getText() + visit(ctx.rightCondition());
        }
        if(ctx.leftConVar != null) {
            return ctx.leftConVar.getText() + visit(ctx.rightCondition());
        }
        return null;
    }

    @Override
    public String visitCon2(TLParser.Con2Context ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitCon3(TLParser.Con3Context ctx) {
        return "!(" + ctx.ID().getText() + ")";
    }

    @Override
    public String visitRightCondition(TLParser.RightConditionContext ctx) {

        String print = ctx.getChild(0).getText();

        for(int i = 1; i < ctx.getChildCount(); i++) {

            print += " " + ctx.getChild(i).getText();

        }
        return "    " + print + "\n\n";
    }

    @Override
    public String visitMathExp1(TLParser.MathExp1Context ctx) {

        String print = ctx.getChild(0).getText();

        for(int i = 1; i < ctx.getChildCount(); i++) {

            print += " " + ctx.getChild(i).getText();

        }
        return "    " + print + "\n\n";
    }

    @Override
    public String visitMathExp2(TLParser.MathExp2Context ctx) {


        if(ctx.rightVal != null) {
            return "    " + ctx.leftVar.getText() + " " + visit(ctx.mathOp) + " " + ctx.rightVal.getText() + ";\n\n";
        }

        if(ctx.rightVar != null) {
            return "    " + ctx.leftVar.getText() + " " + visit(ctx.mathOp) + " " + ctx.rightVar.getText() + ";\n\n";
        }

        return null;
    }



    /*** Operations and conditions ***/




    @Override
    public String visitConditionalOperation(TLParser.ConditionalOperationContext ctx) {
        visitChildren(ctx);

        if(ctx.conOpLT != null) {
            return "<";
        }
        if(ctx.conOpLE != null) {
            return "<=";
        }
        if(ctx.conOpGT != null) {
            return ">";
        }
        if(ctx.conOpGE != null) {
            return ">=";
        }
        if(ctx.conOpEQ != null) {
            return "==";
        }
        if(ctx.conOpNEQ != null) {
            return "!=";
        }

        return null;
    }

    @Override
    public String visitMathematicalOperation1(TLParser.MathematicalOperation1Context ctx) {


        if (ctx.mathOpADD != null) {
            return "+";
        }
        if (ctx.mathOpSUB != null) {
            return "-";
        }
        if (ctx.mathOpMUL != null) {
            return "*";
        }
        if (ctx.mathOpDIV != null) {
            return "/";
        }


        return null;
    }

    @Override
    public String visitMathematicalOperation2(TLParser.MathematicalOperation2Context ctx) {

        if(ctx.mathOpADD != null) {
            return "+=";
        }
        if(ctx.mathOpSUB != null) {
            return "-=";
        }
        if(ctx.mathOpMUL != null) {
            return "*=";
        }
        if(ctx.mathOpDIV != null) {
            return "/=";
        }

        return null;
    }

    /*** Aggregator ***/

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if(aggregate == null) {
            return nextResult;
        }
        if(nextResult == null) {
            return aggregate;
        }

        return aggregate + nextResult;
    }

    /*** Type checker ***/

    public void typeCheckerMathExp1(TLParser.MathExp1Context ctx){
        String errorText = "";
        String assignID = ctx.assignId.getText();


        switch (ctx.mathOp.getText()) {

            case "+" -> {
                switch (symbolTable.retrieveSymbol(assignID).getType()) {


                    case Number -> {

                        if(ctx.leftVar != null)  {
                            String leftVarName = ctx.leftVar.getText();
                            if(symbolTable.retrieveSymbol(leftVarName) != null) {
                                if(symbolTable.retrieveSymbol(leftVarName).getType() != Type.Number) {
                                    errorText = "All values must be of same datatype";
                                } else {
                                    errorText = "Variable: " + leftVarName + " is not declared";
                                }
                            }

                        }
                        if(ctx.leftVal != null) {
                            if(ctx.leftVal.numberVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }
                        if(ctx.rightVar != null)  {
                            String rightVarName = ctx.rightVar.getText();
                            if(symbolTable.retrieveSymbol(rightVarName) != null) {
                                if(symbolTable.retrieveSymbol(rightVarName).getType() != Type.Number) {
                                    errorText = "All values must be of same datatype";
                                } else {
                                    errorText = "Variable: " + rightVarName + " is not declared";
                                }
                            }

                        }
                        if(ctx.rightVal != null) {
                            if(ctx.rightVal.numberVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }

                    }
                    case Text -> {

                        if(ctx.leftVar != null)  {
                            String leftVarName = ctx.leftVar.getText();
                            if(symbolTable.retrieveSymbol(leftVarName) != null) {
                                if(symbolTable.retrieveSymbol(leftVarName).getType() != Type.Text) {
                                    errorText = "All values must be of same datatype";
                                } else {
                                    errorText = "Variable: " + leftVarName + " is not declared";
                                }
                            }
                        }
                        if(ctx.leftVal != null) {
                            if(ctx.leftVal.textVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }
                        if(ctx.rightVar != null)  {
                            String rightVarName = ctx.rightVar.getText();
                            if(symbolTable.retrieveSymbol(rightVarName) != null) {
                                if(symbolTable.retrieveSymbol(rightVarName).getType() != Type.Text) {
                                    errorText = "All values must be of same datatype";
                                } else {
                                    errorText = "Variable: " + rightVarName + " is not declared";
                                }
                            }

                        }
                        if(ctx.rightVal != null) {
                            if(ctx.rightVal.textVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }

                    }
                    case Boolean -> {
                        errorText = "Cannot do math expression with boolean value";
                    }
                }

            }



            case "-",  "*", "/" -> {

                switch (symbolTable.retrieveSymbol(assignID).getType()) {


                    case Number -> {

                        if(ctx.leftVar != null)  {
                            String leftVarName = ctx.leftVar.getText();
                            if(symbolTable.retrieveSymbol(leftVarName) != null) {
                                if(symbolTable.retrieveSymbol(leftVarName).getType() != Type.Number) {
                                    errorText = "All values must be of same datatype";
                                } else {
                                    errorText = "Variable: " + leftVarName + " is not declared";
                                }
                            }
                        }
                        if(ctx.leftVal != null) {
                            if(ctx.leftVal.numberVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }
                        if(ctx.rightVar != null)  {
                            String rightVarName = ctx.rightVar.getText();
                            if(symbolTable.retrieveSymbol(rightVarName) != null) {
                                if(symbolTable.retrieveSymbol(rightVarName).getType() != Type.Number) {
                                    errorText = "All values must be of same datatype";
                                } else {
                                    errorText = "Variable: " + rightVarName + " is not declared";
                                }
                            }

                        }
                        if(ctx.rightVal != null) {
                            if(ctx.rightVal.numberVal == null) {
                                errorText = "All values must be of same datatype";
                            }
                        }

                    }
                    case Text -> {
                        errorText = "Cannot do math expression that are not plus, with text values.";
                    }
                    case Boolean -> {
                        errorText = "Cannot do math expression with boolean value";
                    }

                }
            }
            default -> throw new IllegalArgumentException("Type not found by type-checker.");
        }
        System.err.println(errorText);
    }
    public void typeCheckerMathExp2(TLParser.MathExp2Context ctx) {
        String op = null;
        String type = null;
        String errorText = "";

        switch (ctx.mathOp.getText()) {

            case "+=" -> {
                if (ctx.rightVar != null) {

                    String rightVarName = ctx.rightVar.getText();
                    String leftVarName = ctx.leftVar.getText();

                    if (symbolTable.retrieveSymbol(rightVarName) != null) {
                        if (symbolTable.retrieveSymbol(leftVarName) != null) {
                            if (symbolTable.retrieveSymbol(leftVarName).getType() != Type.Number
                                    && symbolTable.retrieveSymbol(rightVarName).getType() != Type.Number) {
                                if (symbolTable.retrieveSymbol(leftVarName).getType() != Type.Text
                                        && symbolTable.retrieveSymbol(rightVarName).getType() != Type.Text) {
                                    //throwTypeError(left, right, errorText);
                                    op = ctx.mathOp.getText();
                                    type = "either string or integer";
                                    errorText = "On operation " + op + ". Both values must be of the same type: " + type;

                                }
                            }

                        } else {
                            errorText = "Variable: " + leftVarName + " is not declared";
                        }
                    } else {
                        errorText = "Variable: " + rightVarName + " is not declared";
                    }
                }


                if (ctx.rightVal != null) {

                    String leftVarName = ctx.leftVar.getText();

                    if (symbolTable.retrieveSymbol(leftVarName) != null) {
                        if (symbolTable.retrieveSymbol(leftVarName).getType() != Type.Number
                                && ctx.rightVal.numberVal == null) {
                            if (symbolTable.retrieveSymbol(leftVarName).getType() != Type.Text
                                    && ctx.rightVal.textVal == null) {
                                //throwTypeError(left, right, errorText);
                                op = ctx.mathOp.getText();
                                type = "either string or integer";
                                errorText = "On operation " + op + ". Both values must be of the same type: " + type;
                            }
                        }

                    } else {
                        errorText = "Variable: " + leftVarName + " is not declared";
                    }

                }
            }

            case "-=", "*=", "/=" -> {

                if (ctx.rightVar != null) {

                    String rightVarName = ctx.rightVar.getText();
                    String leftVarName = ctx.leftVar.getText();

                    if (symbolTable.retrieveSymbol(rightVarName) != null) {
                        if (symbolTable.retrieveSymbol(leftVarName) != null) {
                            if (symbolTable.retrieveSymbol(leftVarName).getType() != Type.Number
                                    && symbolTable.retrieveSymbol(rightVarName).getType() != Type.Number) {
                                //throwTypeError(left, right, errorText);
                                op = ctx.mathOp.getText();
                                type = "integer";
                                errorText = "On operation " + op + ". Both values must be of the same type: " + type;

                            }

                        } else {
                            errorText = "Variable: " + leftVarName + " is not declared";
                        }
                    } else {
                        errorText = "Variable: " + rightVarName + " is not declared";
                    }
                }

                if (ctx.rightVal != null) {
                    String leftVarName = ctx.leftVar.getText();

                    if (symbolTable.retrieveSymbol(leftVarName) != null) {
                        if (symbolTable.retrieveSymbol(leftVarName).getType() != Type.Number && ctx.rightVal.numberVal != null) {
                            //throwTypeError(left, right, errorText);
                            op = ctx.mathOp.getText();
                            type = "integer";
                            errorText = "On operation " + op + ". Both values must be of the same type: " + type;
                        }
                    }
                }
            }
            default -> throw new IllegalArgumentException("Type not found by type-checker.");
        }
        System.out.println(errorText);
    }

    public void getReturnType(TLParser.FuncDecContext ctx) {

        String funcName = ctx.funcID.getText();
        Type returnDt = Type.Void;

        for(int i = 0; i < ctx.getChildCount(); i++) {

            if(ctx.getChild(i) == ctx.returnExp()) {

                if(ctx.returnExp().returnVar != null) {
                    String varName = ctx.returnExp().returnVar.getText();

                    if(symbolTable.retrieveSymbol(varName) != null){
                        returnDt = symbolTable.retrieveSymbol(varName).getType();
                    }
                }
                if(ctx.returnExp().returnVal != null) {

                    if(ctx.returnExp().returnVal == ctx.returnExp().returnVal.numberVal) {
                        returnDt = Type.Number;
                    }
                    if(ctx.returnExp().returnVal == ctx.returnExp().returnVal.textVal) {
                        returnDt = Type.Text;
                    }
                    if(ctx.returnExp().returnVal == ctx.returnExp().returnVal.boolVal) {
                        returnDt = Type.Boolean;
                    }

                }

            }

        }
        Attributes attribute = new Attributes(funcName, returnDt);
        symbolTable.insertSymbol(attribute);
    }


}

