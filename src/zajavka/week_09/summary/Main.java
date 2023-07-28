package zajavka.week_09.summary;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        SomeFunctionallInterface someFunctionallInterface = someInput -> "zajavka".equals(someInput);
//
//        System.out.println(someFunctionallInterface.someMethod("zajavka"));
//        System.out.println(someFunctionallInterface.someMethod("fafki"));

        Predicate<String> predicate = someInput -> "zajavka".equals(someInput);

        System.out.println(predicate.test("zajavka"));
        System.out.println(predicate.test("hello"));
    }
}
