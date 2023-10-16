package zajavka2.warsztat_02.ex_01;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Double, String> biFunction = Main::getString;

        String result = biFunction.apply(12, 12.2);
        System.out.println(result);
    }

    private static String getString(Integer i, Double d) {
        System.out.println("First param: " + i);
        System.out.println("Second param: " + d);
        return i.toString() + d.toString();
    }
}
