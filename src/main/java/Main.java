
import java.time.*;


public class Main {
    public static void main(String[] args) {
        AnimalRecord Johnny = new AnimalRecord("Johnny", LocalDate.of(1998,03,12));
        LocalDate now = LocalDate.now();

        System.out.println(Johnny.getDaysToNextBirthday());






    }
}
