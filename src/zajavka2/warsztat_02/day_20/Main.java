package zajavka2.warsztat_02.day_20;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("First");
        stringSet.add("Second");
        stringSet.add("Third");

        Stream<String> stream = stringSet.stream();

        Stream.empty();
        Stream.of("One", "Two", "Three");
    }
}
