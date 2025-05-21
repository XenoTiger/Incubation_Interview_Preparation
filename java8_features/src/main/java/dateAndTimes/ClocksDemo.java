package dateAndTimes;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class ClocksDemo {
    public static void main(String[] args) {

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);

        Instant instant = clock.instant();
        System.out.println(instant);

        Clock systemUTC = Clock.systemUTC();
        System.out.println(systemUTC.instant());

        Clock offset = Clock.offset(clock, Duration.ofHours(12));
        System.out.println(offset.instant());
    }
}
