package TL.compiler;

<<<<<<< Updated upstream
=======
import TL.compiler.ErrorHandling.ErrorListener;
import TL.compiler.Listener.FuncDecListener;
import TL.compiler.Listener.VarDecListener;
>>>>>>> Stashed changes
import TL.compiler.SymbolTable.SymbolDefListener;
import TL.compiler.TypeChecker.TLTypeCheckerVisitor;
import TL.parser.TLLexer;
import TL.parser.TLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

<<<<<<< Updated upstream
        CharStream input = CharStreams.fromFileName("/Users/Benjamin/IdeaProjects/P4-G3-main/TL-compiler/src/TL/compiler/demo.TL");
        TLLexer lexer = new TLLexer(input);
=======
        try {
            runCompiler(args);
        } catch (Exception e) {
            /*  Whenever an error is thrown in the BuffErrorListener or ANTLRErrorListener, the user has already been
             *  given a message explaining the error and nothing more should be done here.
             */
        }
    }
    public static void runCompiler(String[] args) throws IOException {

        CharStream stream = CharStreams.fromFileName("/Users/sofiagran/Downloads/P4-G3-main/TL-compiler/src/TL/compiler/demo.TL");


        ErrorListener errorListener = new ErrorListener();

        TLLexer lexer = new TLLexer(stream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

>>>>>>> Stashed changes
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TLParser parser = new TLParser(tokens);
        parser.removeErrorListeners();

<<<<<<< Updated upstream
        // ParseTree tree = parser.program() ;
        // new MyVisitor().visit(tree);

        ParseTree tree2 = parser.program();
        System.out.println(new CodeGenerator().visit(tree2));

=======
        parser.addErrorListener(errorListener);
        ParseTree tree = parser.program();

        // Function declaration listener that creates prototypes
>>>>>>> Stashed changes
        ParseTreeWalker walker = new ParseTreeWalker();
        FuncDecListener funcDec = new FuncDecListener();
        walker.walk(funcDec, tree);

        /** VarDecListener varDec = new VarDecListener();
        walker.walk(varDec, tree); **/



        SymbolDefListener symbolDefListener = new SymbolDefListener();
         try {
            walker.walk(symbolDefListener, tree);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
<<<<<<< Updated upstream
       /* TLTypeCheckerVisitor typeChecker =
                new TLTypeCheckerVisitor(symbolTable.globalScope, symbolTable.scopes, errorListener);*/
=======

         TLTypeCheckerVisitor typeChecker =
               new TLTypeCheckerVisitor(errorListener);
         typeChecker.visit(tree);

        // Code generation
        CodeGenerator codeGenerator = new CodeGenerator(symbolDefListener, symbolDefListener.currentScope);
        String targetCode = codeGenerator.visit(tree);
        System.out.println(targetCode);

>>>>>>> Stashed changes
    }
}
