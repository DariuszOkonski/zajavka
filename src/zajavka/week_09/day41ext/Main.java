package zajavka.week_09.day41ext;

public class Main {
    public static void main(String[] args) {
        System.out.println("day 41ext");
        recursiveMethod("Zajavk");
    }

    public static void recursiveMethod(String anything) {
        if(anything.length() > 100) {
            return;
        }
        System.out.println(anything);
        recursiveMethod(anything + "a");
    }
}
