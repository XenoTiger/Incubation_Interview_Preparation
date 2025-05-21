package dateAndTimes;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDatesAndTimesDemo {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate of = LocalDate.of(2024, 11, 11);
        System.out.println(of);
        LocalDate of2 = LocalDate.of(2024, Month.DECEMBER, 11);
        System.out.println(of2);

        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(5, 7);
        System.out.println(lt2);

        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(2024, 12, 11, 5, 7);
        System.out.println(ldt2);
        LocalDateTime ld3 = LocalDateTime.of(date, lt1);
        System.out.println(ld3);

        ZoneId zoneId = ZoneId.of("Etc/GMT+9");
        System.out.println(zoneId);
        String displayName = zoneId.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println(displayName);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(ldt1, zoneId);
        System.out.println(zonedDateTime);

        String format1 = DateTimeFormatter.BASIC_ISO_DATE.format(ldt1);
        System.out.println(format1);
        String format2 = DateTimeFormatter.ofPattern("dd-MM-yyyy").format(ldt1);
        System.out.println(format2);
        String format3 = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(ldt1);
        System.out.println(format3);
//OffsetDateTime.. comparison (total time to take)

        //


    }

}
