import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Alex {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTimeIn2Weeks = localDateTime.plusWeeks(2);
        System.out.println(localDateTimeIn2Weeks);
        int comparison = localDateTime.compareTo(localDateTimeIn2Weeks);

        if (comparison <0) {
            System.out.println("Datum 1 liegt vor dem Datum 2");
        } else if (comparison >0) {
            System.out.println("Datum 1 liegt nach dem Datum 2");
        }
        else {
            System.out.println("Datum 1 ist dem Datum 2 identisch");
        }
        LocalDate firstDate = LocalDate.of(2023,6,15);
        LocalDate secondDate = LocalDate.of(23,10,23);
        long difference = ChronoUnit.DAYS.between(secondDate, firstDate);
        System.out.println("The difference between firstDate und secondDate: " + difference + " days");

    }
}
