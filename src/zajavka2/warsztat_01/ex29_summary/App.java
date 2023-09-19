package zajavka2.warsztat_01.ex29_summary;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> ourMap = new HashMap<>();
        ourMap.put(5, "ja");
        ourMap.put(1, "Ty");


        System.out.println(ourMap);
        System.out.println(ourMap.get(5));
        System.out.println(ourMap.getOrDefault(10, "Ni ma"));
    }
}
