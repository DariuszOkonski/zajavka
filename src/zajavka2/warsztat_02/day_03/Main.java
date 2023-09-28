package zajavka2.warsztat_02.day_03;

public class Main {
    public static void main(String[] args) {
        function1(() -> "zajavka");
        Interface1<String> stringInterface1 = function2();
        stringInterface1.compute();
    }

    public static String function1(final Interface1<String> param1) {
        return param1.compute();
    }

    public static Interface1<String> function2() {
        return () -> "zajavka";
    }

    public int add(int a, int b) {
        return a + b;
    }

    interface Interface1<T> {
        T compute();
    }
}
