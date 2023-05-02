package TL.compiler.Listener;

import TL.parser.TLBaseListener;
import TL.parser.TLLexer;
import TL.parser.TLParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VarDecListener extends TLBaseListener {

    // Step 1: Define a set to store variable names
    private Set<String> variableNames = new HashSet<>();

    // Step 2: Override the enterEveryRule method to visit every node in the parse tree
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);

        // Step 3: Check if the current node is a variable declaration
        if (ctx instanceof TLParser.NumberDecContext) {
            TLParser.NumberDecContext varDecl = (TLParser.NumberDecContext) ctx;
            String varName = varDecl.ID().getText();
            String type = "int ";

            // Add the variable name to the set
            variableNames.add(varName);

        }

        if (ctx instanceof TLParser.TextDecContext) {
            TLParser.TextDecContext varDecl = (TLParser.TextDecContext) ctx;
            String varName = varDecl.ID().getText();
            String type = "char ";

            // Add the variable name to the set
            variableNames.add(varName);

        }

        if (ctx instanceof TLParser.BoolDecContext) {
            TLParser.BoolDecContext varDecl = (TLParser.BoolDecContext) ctx;
            String varName = varDecl.ID().getText();
            String type = "bool ";

            // Add the variable name to the set
            variableNames.add(varName);

        }

        if (ctx instanceof TLParser.FuncDecContext) {
            TLParser.FuncDecContext funcDecl = (TLParser.FuncDecContext) ctx;
            String varName = funcDecl.funcID.getText();
            String type = "function";

            variableNames.add(varName);

        }



    }

    public boolean checkNames(String name) {

        if (!(variableNames.contains(name))) {
            return false;
        }
        return true;
    }






    // Override the visitTerminal method to check for variable uses
    /** @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);


        // Check if the current node is an identifier
        if (node.getSymbol().getType() == TLLexer.ID) {
            String varName = node.getText();

            System.out.println(varName.getClass());
            // Step 4: Check if the variable name exists in the set
            if (!(variableNames.containsKey(varName))) {
                valEx(false);
            }
        }
        valEx(true);
    } **/


}
