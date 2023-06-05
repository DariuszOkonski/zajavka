package zajavka.week_02.day10ext;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = cat1;

        System.out.println(cat1 != cat2);
    }
}

