package dateAndTimes;

import java.time.LocalDateTime;

public class DatesCompareDemo {

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2024, 12, 12, 5, 15);

        System.out.println(ldt1.compareTo(ldt2));
        System.out.println(ldt1.equals(ldt2));
        System.out.println(ldt1.isBefore(ldt2));
        System.out.println(ldt1.isAfter(ldt2));
    }
}
