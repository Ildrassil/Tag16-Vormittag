
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.temporal.ChronoUnit;

public class JakobTime {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);
        LocalDateTime twoWeeks =  adddTwoWeek(localDateTime);
        System.out.println(localDateTime +  " with 14 Days added " + twoWeeks);
        LocalDateTime timeToCompare = LocalDateTime.of(2024,3,9,10,34);
        LocalDateTime timeA = LocalDateTime.of(2024,2,9,10,34);
        System.out.println(localDateTime.isAfter(timeToCompare));
        System.out.println("Number of Days: "+ChronoUnit.DAYS.between(timeA, timeToCompare) + " between – " + timeA + " and" + timeToCompare);

    }

    public static LocalDateTime adddTwoWeek(LocalDateTime localdateTime){
         LocalDateTime twoWeeks = localdateTime.plusWeeks(2);
        return twoWeeks;
    }


}
