package zajavka.week_05.day23ext;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Mruczan");
        System.out.println(cat);
        method(cat);
        System.out.println(cat);
    }

    public static void method(Cat cat) {
        cat = new Cat("Olek");
//        cat.setName("Olek");
        System.out.println(cat);
    }
}

