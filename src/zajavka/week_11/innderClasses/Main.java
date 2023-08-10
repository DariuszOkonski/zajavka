package zajavka.week_11.innderClasses;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String a = "zajavkaA";

        Predicate<Integer> somePredicate = someInt -> a.length() > someInt;
    }
}

