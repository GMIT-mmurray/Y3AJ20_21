import java.time.*;
import java.time.format.DateTimeFormatter;

public class DTExamples {

    public DTExamples() {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime.getNano());
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        String dateString = "19/11/2020 12:30:34:567";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss:nnn");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
        System.out.println(parsedDateTime);
        ZonedDateTime now = ZonedDateTime.now();

        String timeStamp = "2010-01-01T12:00:00+01:00";
        ZonedDateTime localTimeObj = ZonedDateTime.parse(timeStamp);
        System.out.println(localTimeObj);

        ZonedDateTime now1 = ZonedDateTime.now( ZoneId.of("GMT+05:30") );
        System.out.println( now +"  "+ now1);
    }

    public static void main(String[] args) {
        new DTExamples();
    }

}
