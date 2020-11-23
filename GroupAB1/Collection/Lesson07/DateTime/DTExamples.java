import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DTExamples {

    public DTExamples() {
        LocalTime currentTime = LocalTime.now();
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        String dateString = "2020-11-08T14:10:06:234";
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).ofPattern("yyyy-MM-dd HH:mm:ss:nnn");

        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
        System.out.println(parsedDateTime);
    }



    public static void main(String[] args) {
        new DTExamples();
    }

}
