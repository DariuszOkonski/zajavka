package zajavka2.warsztat_02.day_09;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Szczecin");
        cities.add("Gdynia");
        cities.add("Zakopane");

        Predicate<String> predicate = c -> c.contains("i");
        print(cities, predicate);

    }

    private static void print(final List<String> cities, Predicate<String> checker) {
        for (String city : cities) {
            if(checker.test(city)) {
                System.out.println(city);
            }
        }
    }
}
