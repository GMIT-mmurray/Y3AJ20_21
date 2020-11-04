import java.io.IOException;
import java.util.Vector;

public class IterateOnGradeVector {
    
    public static void main(String [] args) throws IOException {
        Vector<Grade> students = GradesLoader.loadGradesInVector(args[0]);
        for (Grade gradeForStudent : students) {
            System.out.printf("%s %s SSN-%s  Test1: %.1f Test2: %.1f Test3: %.1f Test4: %.1f >>> Final Grade: %.2f \n",
                    gradeForStudent.firstName,gradeForStudent.lastName,gradeForStudent.SSN,
                    gradeForStudent.test1,gradeForStudent.test2,gradeForStudent.test3,gradeForStudent.test4,
                    (gradeForStudent.test1+gradeForStudent.test2+gradeForStudent.test3+gradeForStudent.test4)/4);
        }
    }

}