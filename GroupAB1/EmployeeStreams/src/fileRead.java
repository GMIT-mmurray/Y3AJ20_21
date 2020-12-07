import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
    public class fileRead {
        public static void main(String[] args) throws IOException {
            Stream<String> rows1 = Files.lines(Paths.get("src\\text.txt"));
            List<String[]> s = rows1.map(x -> x.split(","))
                    .filter(x -> x.length == 3)
                    //.count();
                    .collect(Collectors.toList());

            //System.out.println(rowCount + " rows.");
            rows1.close();
        }
    }


