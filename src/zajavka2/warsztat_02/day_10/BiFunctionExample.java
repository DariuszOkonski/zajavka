package zajavka2.warsztat_02.day_10;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Table, Window, String> biFunction = (tbl, wnd) -> {
            return tbl.toString().concat(wnd.toString());
        };

        System.out.println(biFunction.apply(new Table(), new Window()));
    }

    static class Table {

    }

    static class Window {

    }
}
