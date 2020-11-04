import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;

public class GradesLoader {

    public static Hashtable<String, Grade> loadGradesInHashtableByEmail(String pathToFile) throws IOException {
        Hashtable<String, Grade> grades = new Hashtable<>();

        BufferedReader lineReader = new BufferedReader(new FileReader(pathToFile));
        try (CSVReader reader = new CSVReader(lineReader)) {
            String [] row = null;
            while ( (row = reader.readRow()) != null) {
                Grade grade = Grade.fromValues(row);
               // grades.put(grade.email, grade);
            }
        }

        return grades;
    }

    public static void loadGradesIntoSet(String pathToFile, Set<Grade> gradesSet) throws IOException {
        BufferedReader lineReader = new BufferedReader(new FileReader(pathToFile));
        try (CSVReader reader = new CSVReader(lineReader)) {
            String [] row = null;
            while ( (row = reader.readRow()) != null) {
                gradesSet.add(Grade.fromValues(row));
            }
        }
    }

    public static Vector<Grade> loadGradesInVector(String pathToFile) throws IOException{
        Vector<Grade> grades = new Vector<>();

        BufferedReader lineReader = new BufferedReader(new FileReader(pathToFile));
        try (CSVReader reader = new CSVReader(lineReader,true)) {
            String [] row = null;
            while ( (row = reader.readRow()) != null) {
                grades.add(Grade.fromValues(row));
            }
        }

        return grades;
    }

}