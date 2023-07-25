package zajavka.week_08.day40ext;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("one", "Bartek");
        map.put("two", "Karol");
        map.put("three", "Marcin");

        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            System.out.println(entries.next());
        }
    }
}
