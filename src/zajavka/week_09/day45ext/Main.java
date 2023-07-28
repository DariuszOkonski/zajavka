package zajavka.week_09.day45ext;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> ifEmptyFilter = s -> {
            System.out.println("checking: " + s);
            return s.isEmpty();
        };

        List<String> list = new ArrayList<>();
        list.add("Warka");
        list.add("");
        list.add("Parka");
        list.add("");

        System.out.println(list);
        list.removeIf(ifEmptyFilter);
        System.out.println(list);
    }
}

