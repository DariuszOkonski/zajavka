package zajavka.week_08.day39ext;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> citiesAttractions = new HashMap<>();

        citiesAttractions.put("Warsaw", List.of("Palac Kultury i Nauki", "Metro Politechnika"));
        citiesAttractions.put("Gdynia", Arrays.asList("Galeria Handlowa", "Neptun"));

        List<String> londonsAttractions = new ArrayList<>();
        londonsAttractions.add("Londons Eye");
        londonsAttractions.add("Buckingham Palace");
        citiesAttractions.put("London", londonsAttractions);

        Set<Map.Entry<String, List<String>>> entries = citiesAttractions.entrySet();

        for (Map.Entry<String, List<String>> entry : entries) {
            System.out.println(entry.getKey());
            for (String attraction: entry.getValue()) {
                System.out.println(entry.getKey() + ": " + attraction);
            }
        }

        var citiesAttractionsKey = citiesAttractions.keySet();
        System.out.println(citiesAttractionsKey);
    }
}