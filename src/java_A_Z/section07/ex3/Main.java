package java_A_Z.section07.ex3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        // Current Date and Time
        System.out.println("Current Date: " + LocalDate.now());
        System.out.println("Current Time: " + LocalTime.now());
        System.out.println("Current Date & Time: " + LocalDateTime.now());

        // Creating Dates and Times
        LocalDate dateA = LocalDate.of(2020, Month.MARCH, 15);
        LocalDate dateB = LocalDate.of(2020, 3, 15);
        System.out.println("dateA: " + dateA + " dateB: " + dateB);

        LocalTime time = LocalTime.of(9, 33);
        System.out.println("time: " + time);


    }
}
