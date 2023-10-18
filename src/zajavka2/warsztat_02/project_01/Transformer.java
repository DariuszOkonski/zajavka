package zajavka2.warsztat_02.project_01;

import java.util.function.Function;

public class Transformer {
    public static <T, R extends Number> Function<T, R> getFunctionImpl() {
        return (T t) -> (R) Integer.valueOf(t.toString().length());
    }
}
