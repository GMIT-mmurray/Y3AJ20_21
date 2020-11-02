import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This program demonstrates how to read characters from a text file.
 * @author www.codejava.net
 *
 */
public class TextFileReadingExample1 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("clients.txt"));
            String s = new String();

            while ((s = br.readLine()) != null) {
                System.out.print(s + "\n");
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}