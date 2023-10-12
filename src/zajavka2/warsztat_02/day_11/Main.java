package zajavka2.warsztat_02.day_11;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Cat> someValWithCat = Optional.of("SomeVal").map(Cat::new);
        System.out.println(someValWithCat);
    }

    private static class Cat {
        public Cat(String s) {
        }
    }
}
