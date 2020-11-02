import java.io.BufferedReader;
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
        try (FileInputStream inputStream = new FileInputStream("MyFile.txt");
            InputStreamReader reader = new InputStreamReader(inputStream, "UTF-16");
            BufferedReader br = new BufferedReader(reader);){

            String s = new String();

            while ((s = br.readLine()) != null) {
                System.out.print(s + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}