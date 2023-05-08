package TL.compiler;

import TL.compiler.ErrorHandling.ErrorListener;
import TL.compiler.Listener.FuncDecListener;
import TL.compiler.Listener.ParamListener;
import TL.compiler.SymbolTable.SymbolTable;
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


        CharStream stream = CharStreams.fromFileName("/Users/sofiagran/Desktop/P4-G3-main/TL-compiler/src/TL/compiler/demo.TL");

        ErrorListener errorListener = new ErrorListener();

        TLLexer lexer = new TLLexer(stream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TLParser parser = new TLParser(tokens);
        parser.removeErrorListeners();


        parser.addErrorListener(errorListener);
        ParseTree tree = parser.program();
        parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolTable symbolTable = new SymbolTable();

        ParamListener param = new ParamListener();
        walker.walk(param, tree);

        //FuncDecListener funcDec = new FuncDecListener(param, symbolTable);
        //walker.walk(funcDec, tree);



        // Code generation
        CodeGenerator codeGenerator = new CodeGenerator(symbolTable);
        String targetCode = codeGenerator.visit(tree);
        System.out.println(targetCode);

    }
}
