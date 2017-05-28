package pacote;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import ast.*;
import visitor.*;

/**
 * Created by Pintor on 26/05/17.
 */
public class Teste {

    public static void main(String[] args) throws IOException {

        InputStream stream = new FileInputStream("Test.txt");
        ANTLRInputStream input = new ANTLRInputStream(stream);
        gramLexer lexer = new gramLexer(input);
        CommonTokenStream token = new CommonTokenStream(lexer);
        gramParser parser = new gramParser(token);

        Program prog = parser.goal().programa;

        prog.accept(new PrettyPrintVisitor());

    }

}
