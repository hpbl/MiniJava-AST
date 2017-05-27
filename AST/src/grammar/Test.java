package grammar;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Created by Pintor on 24/05/17.
 */
public class Test {

    public static void main(String[] args) throws IOException {

        InputStream stream = new FileInputStream("Test.txt");
        ANTLRInputStream input = new ANTLRInputStream(stream);
        MiniJavaLexer lexer = new MiniJavaLexer(input);
        CommonTokenStream token = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(token);
        parser.goal();

        //Objeto ANTLR

        // Program p = parser.goal();


    }
}
