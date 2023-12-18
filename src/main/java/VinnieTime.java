import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class VinnieTime {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("The current time: " + now);

        Instant futureNow = now.plus(Duration.ofDays(14));

        System.out.println("Now is the the future (i.e. 14 days to be precise): " + futureNow);

        System.out.println("The now of the future is after the now of the past? " + futureNow.isAfter(now));

        LocalDateTime timeBugParty = LocalDateTime.ofEpochSecond(Long.valueOf(Integer.MAX_VALUE), 0, ZoneOffset.UTC);

        System.out.println("In " + ChronoUnit.DAYS.between(now, timeBugParty.toInstant(ZoneOffset.UTC)) + " days we might have a bigger problem than the year 2000 problem.");
    }
}
