package TL.compiler;


import TL.parser.TLLexer;
import TL.parser.TLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import TL.compiler.SymbolTable.SymbolDefListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        CharStream input = CharStreams.fromFileName("/Users/Rasmu/OneDrive/Dokumenter/GitHub/P4-G3/TL-compiler/src/TL/compiler/demo.TL");
        TLLexer lexer = new TLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TLParser parser = new TLParser(tokens);

        // ParseTree tree = parser.program() ;
        // new MyVisitor().visit(tree);

        ParseTree tree2 = parser.program();
        System.out.println(new CodeGenerator().visit(tree2));


        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolDefListener symbolDefListener = new SymbolDefListener();
        try {
            walker.walk(symbolDefListener, tree2);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
