package zajavka2.warsztat_01.ex13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "A", "1", "aA", "Aa", "A1", "a1");
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);

    }
}
