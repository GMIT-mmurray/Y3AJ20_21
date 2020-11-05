import java.io.IOException;
import java.util.Vector;

public class IterateOnGradesVector {

    public static void main(String [] args) throws IOException {
        Vector<Grade> students = GradesLoader.loadGradesInVector(args[0]);
        for (Grade gradeAsObject : students) {
        //    System.out.printf("%s - %s\n", gradeAsObject.name, gradeAsObject.email);
        }
    }

}
