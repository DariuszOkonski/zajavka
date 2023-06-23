package zajavka.week_05.day25;

public class App {
    public static void main(String[] args) {
        String someString = "methodChaining";
        Cat cat1 = new Cat()
                .setName("Klamor")
                .setAge("5")
                .setColor("Black")
                .setHoursOfSleeping("20");

        System.out.println(cat1);
    }
}
