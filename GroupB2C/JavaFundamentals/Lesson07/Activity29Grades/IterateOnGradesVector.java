import java.io.IOException;
import java.util.Vector;

public class IterateOnGradesVector {

    public static void main(String [] args) throws IOException {
        Vector<Grade> students = GradesLoader.loadGradesInVector(args[0]);
        for (Grade student : students) {
            System.out.printf("%s %s %s %.2f %.2f %.2f %.2f Av %.2f\n",
                               student.firestname, student.lastName, student.SSN,
                               student.test1,student.test2,student.test3,student.test4,
                               (student.test1+student.test2+student.test3+student.test4)/4);
        }
    }

}
