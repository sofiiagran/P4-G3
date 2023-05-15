package TL.compiler;

import TL.compiler.CodeGen.CodeGenerator;

import java.io.FileWriter;
import java.io.IOException;

public class BuildCProgram {


    public StringBuilder buildProgram(CodeGenerator codeGen, String code) {

        StringBuilder buildProgram = new StringBuilder();

        buildProgram.append(codeGen.getLibs());
        buildProgram.append(codeGen.getFuncPrototypes());
        buildProgram.append(codeGen.getGlobalDec());
        buildProgram.append(code);

        return buildProgram;
    }

    public void printCProgramToFile(StringBuilder builder) {
        //Write to file
        try {
            FileWriter myWriter = new FileWriter("/Users/sofiagran/Documents/GitHub/P4-G3/TL-compiler/output/output.c");
            myWriter.write(String.valueOf(builder));
            myWriter.close();
            System.out.println("Successfully wrote to the file.\n File can be find in the output folder");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
