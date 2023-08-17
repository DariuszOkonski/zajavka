package java_A_Z.section07.ex2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
        System.out.println(dateFormat.format(date));

        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, Calendar.OCTOBER, 1);
        calendar.add(Calendar.DATE, 2);
        Date date2 = calendar.getTime();

        System.out.println(date.compareTo(date2));

        TimeZone timeZone = TimeZone.getDefault();
        String zoneName = timeZone.getDisplayName();
        System.out.println(zoneName);
    }
}
