package zajavka.week_08.day38;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Gdansk");
        set1.add("Warszawa");
        set1.add("Szczecin");
        set1.add("Szczecin");
        set1.add("Szczecin");
        set1.add("Wroclaw");

        Set<String> set2 = new HashSet<>();
        set2.add("Lodz");
        set2.add("Warszawa");
        set2.add("Bialystok");
        set2.add("Zakopane");
        set2.add("Szczecin");
        set2.add("Wroclaw");

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(union);
    }
}
