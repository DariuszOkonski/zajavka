package zajavka.week_02.day6;

import zajavka.week_02.day6.animal.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Rudy");
        Cat cat2 = new Cat("Klakier");

        System.out.println(cat1.leftLegBack);
        System.out.println(cat1.gimmeVoice());
        System.out.println(cat1.getName());
        System.out.println(cat2.getName());

        System.out.println("==================");
        Cat cat3 = new Cat("mruczek");
        System.out.println(cat3.getName());
        cat3.setName("spioch");
        System.out.println(cat3.getName());

        newMethod();
    }

    private static void newMethod() {
        String variable = "variable";
        System.out.println(variable);
    }
}


