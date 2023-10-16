package zajavka2.warsztat_02.day_12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of("someValue")
                .map(a -> a.length())
                .filter(x -> x > 5)
                .ifPresent(toConsume -> System.out.println(toConsume));

        List<String> stringList = new ArrayList<>();
        stringList.removeIf(e -> e.contains("abc"));

        Map<Integer, String> someMap = new HashMap<>();
        someMap.put(1, "zajavka");
        someMap.put(2, "zajavka2");
        someMap.put(3, "zajavka3");
        someMap.put(4, "zajavka4");

        System.out.println(someMap);
        someMap.replaceAll((key, value) -> value + "changed");
        System.out.println(someMap);
    }
}
