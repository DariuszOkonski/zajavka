package zajavka.week_09.day43ext;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Period period = Period.of(0, 11, 22);

        LocalDateTime localDateTime = LocalDateTime.of(2020,1,1,1,11);
        LocalDateTime localDateTime2 = LocalDateTime.of(2021,3,4,1,11);

        long between = ChronoUnit.DAYS.between(localDateTime, localDateTime2);
        System.out.println(between);
    }
}
