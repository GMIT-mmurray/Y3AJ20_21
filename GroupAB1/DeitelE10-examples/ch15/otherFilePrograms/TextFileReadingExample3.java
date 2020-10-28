import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This program demonstrates how to read characters from a text file
 * using a BufferedReader for efficiency.
 * @author www.codejava.net
 *
 */
public class TextFileReadingExample3 {

    public static void main(String[] args) {
        try {
            //FileReader reader = new FileReader("clients.txt");
            //BufferedReader bufferedReader = new BufferedReader(reader);
            BufferedReader bufferedReader = new BufferedReader(new FileReader("clients.txt"));
            String line;

            while ((line = bufferedReader.readLine()) != null ) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}