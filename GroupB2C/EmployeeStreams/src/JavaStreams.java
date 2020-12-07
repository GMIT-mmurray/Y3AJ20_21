import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) throws IOException {
        Stream<String> rows1 = Files.lines(Paths.get("src\\text.txt"));

        int rowCount = (int)rows1.map(x -> x.split(","))
                                 .filter(x -> x.length == 3)
                                 .count();
       // System.out.println(rowCount + " rows.");
        Stream<String> rows2 = Files.lines(Paths.get("src\\text.txt"));
        System.out.println(rows2);
        List<String[]> s  = rows2.map(x -> x.split(","))
                                            .filter(x -> x.length == 3)
                                            .collect(Collectors.toList());
          for (String[]  st:s )
               System.out.println(st[0]+" "+ st[1]+" "+st[2]);
        //rows1.close();
    }
}
