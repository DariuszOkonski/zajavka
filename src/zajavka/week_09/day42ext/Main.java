package zajavka.week_09.day42ext;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2000, Month.MARCH, 25);
        LocalDateTime localDateTime = localDate.atTime(1, 15);

        System.out.println(localDateTime);

//
//        LocalTime localTime = LocalTime.parse("00:15:25");
//        System.out.println(localTime);
//
//        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
//        System.out.println(localDateTime);
    }
}
