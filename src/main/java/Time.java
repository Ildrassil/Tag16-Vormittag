import javax.crypto.spec.PSource;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Time {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        addTwoWeek(localDate);
        compareTwoDates();
        differenceInDays();

    }

    public static void addTwoWeek(LocalDate localDate){

        System.out.println("plus two weeks: "+localDate.plusWeeks(2));

    }

    public static void  compareTwoDates(){

        LocalDate localDate = LocalDate.now();

        LocalDate localDate1 = localDate.plusWeeks(3);

        int  c = localDate.compareTo(localDate1);

        if (c<0){
            System.out.println(localDate + " is vor dem " + localDate1);
        } else if (c>0) {
            System.out.println(localDate + " is nach dem " + localDate1);
        }else {
            System.out.println("beide datum sind gleich");
        }

    }

    public static void differenceInDays(){
        LocalDate localDate= LocalDate.of(2023, 12, 1);
        LocalDate localDate1= LocalDate.of(2022, 11, 1);

        long difference = ChronoUnit.DAYS.between(localDate1, localDate);

        System.out.println(difference);
    }

}
