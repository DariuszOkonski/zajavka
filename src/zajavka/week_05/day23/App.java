package zajavka.week_05.day23;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Andrzej");
        System.out.println(cat);
        passByReferenceOrPassByValue(cat);
        System.out.println(cat);
    }

    private static void passByReferenceOrPassByValue(Cat cat) {
//        cat = new Cat("Rafal");
        cat.setName("Grzegorz");
    }
}

