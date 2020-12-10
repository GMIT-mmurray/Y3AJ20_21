import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        Student student1 = new Student(
                "Jayesh",
                20,
                new Address("1234"),
                Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

        Student student2 = new Student(
                "Khyati",
                20,
                new Address("1235"),
                Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

        Student student3 = new Student(
                "Jason",
                20,
                new Address("1236"),
                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

        List<Student> students = Arrays.asList(student1, student2, student3);

        Student student = students.stream()
                .filter(s -> s.getName().equals("Jayesh"))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);

        student = students.stream()
                .filter(s -> s.getAddress().getZipcode().equals("1235"))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);

        List<Student> studentList = students.stream()
                .filter(s -> s.getMobileNumbers().stream().anyMatch((m) -> m.getNumber().equals("3333") || m.getNumber().equals("4444")))
                .collect(Collectors.toList());

        String studentListNames = studentList.stream()
                .map(n -> n.getName())
                .collect(Collectors.joining(",", "{{{", "]]]"));

        String studentListAdd = students.stream()
                .map(n -> n.getAddress().getZipcode())
                .collect(Collectors.joining("......", "<<<<", ">>>>"));

    }
}
