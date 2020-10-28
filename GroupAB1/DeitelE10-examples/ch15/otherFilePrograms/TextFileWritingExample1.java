import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This program demonstrates how to write characters to a text file.
 * @author www.codejava.net
 *
 */
public class TextFileWritingExample1 {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("MyFile.txt", false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hello World");
            bufferedWriter.write("\r\n");   // write new line
            bufferedWriter.newLine();
            bufferedWriter.write("Good Bye!");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}