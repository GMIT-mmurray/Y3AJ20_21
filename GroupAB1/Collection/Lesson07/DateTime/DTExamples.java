import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DTExamples {

    public DTExamples() {
        LocalTime currentTime = LocalTime.now();
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        String dateString = "2020-11-08 14:10:06:234";
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).ofPattern("yyyy-MM-dd HH:mm:ss:nnn");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
        System.out.println(parsedDateTime);
////////////////////////////////////////////////////////////////////////////////////////////

        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime now1 = ZonedDateTime.now( ZoneId.of("GMT+05:30") );
        System.out.println(now);
        System.out.println(now1);

        String dateString1 = "2020-11-23T15:22:37.770Z";
        ZonedDateTime locatTime1 = ZonedDateTime.parse(dateString1);

        String dateString2 = "2020-11-23T15:22:37.770-02:00";
        ZonedDateTime locatTime2 = ZonedDateTime.parse(dateString2);

    }



    public static void main(String[] args) {
        new DTExamples();
    }

}
