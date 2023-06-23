package zajavka.week_05.day25;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Roman");
        Cat cat2 = new Cat("Adam");

        cat1 = null;
        cat2 = null;

        System.gc();
    }
}

