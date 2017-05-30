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
        hpbl_rfl3Lexer lexer = new hpbl_rfl3Lexer(input);
        CommonTokenStream token = new CommonTokenStream(lexer);
        hpbl_rfl3Parser parser = new hpbl_rfl3Parser(token);

        Program prog = parser.goal().programa;

        //prog.accept(new PrettyPrintVisitor());

        BuildSymbolTableVisitor stVis = new BuildSymbolTableVisitor();
        //construindo tabela de símbolos
        prog.accept(stVis);
        //fazendo a checagem de tipos
        prog.accept(new TypeCheckVisitor(stVis.getSymbolTable()));
    }

}
