import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public record AnimalRecord(
        String name,
        LocalDate birthday
) {
    Long getDaysToNextBirthday() {
        LocalDate now = LocalDate.now();
        LocalDate nextBirthday = birthday.plusYears(ChronoUnit.YEARS.between(birthday, now)+1);

        return ChronoUnit.DAYS.between(now, nextBirthday);
    }
}
