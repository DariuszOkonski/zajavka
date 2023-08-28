package java_A_Z.section11.ex5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Adam");
        map.put(155, "Joe");
        map.put(90, "Tom");
        map.put(30, "Adam");
        map.put(10, "Kate");
        map.put(10, "Judy");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(Collections.unmodifiableMap(map));
    }
}
