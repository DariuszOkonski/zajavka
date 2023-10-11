package zajavka2.warsztat_02.day_09;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<String, Dog> biPredicate = BiPredicateExample::extracted;

        boolean dogResult = biPredicate.test("Dog", new Dog());
        System.out.println(dogResult);
    }

    private static boolean extracted(String str, Dog d) {
        System.out.println("Testing: " + str + ", dog: " + d);
        return d.toString().contains(str);
    }

    static class Dog {

    }
}
