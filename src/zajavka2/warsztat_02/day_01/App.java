package zajavka2.warsztat_02.day_01;



import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
//        Checkable checkablePrevious = new CheckableImpl();
//        boolean hello = checkablePrevious.myTester("hello");
//        System.out.println(hello);
//        System.out.println("=================");
//
//        Checkable checkable = value -> {
//            System.out.println("Lambda calling");
//            return value.contains("zajavka");
//        };
//
//        boolean hi = checkable.myTester("moja zajavka");
//        System.out.println(hi);
//
//        System.out.println("============");

        List<String> cities = List.of("Warszawa", "Szczecin", "Gdynia", "Zakopane");

        final Integer variable = 4;

        printIf(cities, value -> value.contains("a"));
    }

    public static void printIf(final List<String> inputList, Predicate<String> checker) {
        for (String value : inputList) {
            if(checker.test(value)) {
                System.out.println("printing: " + value);
            }
        }
    }
}

