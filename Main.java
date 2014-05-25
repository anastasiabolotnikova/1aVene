/**
 * Created by Admin on 25.05.2014.
 */
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) throws FileNotFoundException {

        String fileName = args[0];
        String content = getFileContent(fileName);

        ParseTree tree;
        tree = Interpretator.createParseTree(content);
        Interpretator.parseTreeToAst(tree);
        //System.out.println(Interpretator.evaluate(tree));
        //System.out.println(Interpretator.run(tree));
    }

    public static String getFileContent(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        String expr = "";
        while(sc.hasNextLine()) {
            expr += sc.nextLine()+"\n";
        }
        sc.close();
        return expr;
    }
}