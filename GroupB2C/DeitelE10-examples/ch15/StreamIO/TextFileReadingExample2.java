import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program demonstrates how to read characters from a text file using
 * a specified charset.
 * @author www.codejava.net
 *
 */
public class TextFileReadingExample2 {

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("clients.txt");
            InputStreamReader reader = new InputStreamReader(inputStream, "UTF-16");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}