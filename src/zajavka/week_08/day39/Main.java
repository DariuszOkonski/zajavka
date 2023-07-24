package zajavka.week_08.day39;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, List<String>> people = new HashMap<>();

        people.put(1, List.of("Rafał Bernardyński", "Rafar Bernardyński 2", "Rafał Bernardyński 3"));
        people.put(2, Collections.emptyList());
        people.put(3, Collections.singletonList("Norbert Rafalski"));


        Set<Map.Entry<Integer, List<String>>> entries = people.entrySet();

    }
}
