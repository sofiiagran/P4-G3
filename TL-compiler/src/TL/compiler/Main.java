package TL.compiler;

import TL.compiler.CodeGen.CodeGenerator;
import TL.compiler.Listener.FuncCallListener;
import TL.compiler.Listener.FuncDecListener;
import TL.compiler.Listener.GlobalDecListener;
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


        CharStream stream = CharStreams.fromFileName("/Users/sofiagran/Documents/GitHub/P4-G3/TL-compiler/src/TL/compiler/demo.TL");

        //ErrorListener errorListener = new ErrorListener();

        TLLexer lexer = new TLLexer(stream);
        lexer.removeErrorListeners();
        //lexer.addErrorListener(errorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TLParser parser = new TLParser(tokens);
        parser.removeErrorListeners();

        //parser.addErrorListener(errorListener);
        ParseTree tree = parser.program();
        parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();

        ParamListener param = new ParamListener();
        walker.walk(param, tree);

        FuncDecListener funcDec = new FuncDecListener(param, param.symbolTable);
        walker.walk(funcDec, tree);

        FuncCallListener funcCallListener = new FuncCallListener(funcDec, param.symbolTable);
        walker.walk(funcCallListener, tree);

        //GlobalDecListener globalDecListener = new GlobalDecListener();
        //walker.walk(globalDecListener, tree);

        // Code generation
        CodeGenerator codeGenerator = new CodeGenerator();
        String targetCode = codeGenerator.visit(tree);
        System.out.println(targetCode);

    }
}
