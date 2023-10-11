package zajavka2.warsztat_02.day_09;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer1 = ConsumerExample::extracted;
        consumer1.accept("Zakopane");
    }

    private static void extracted(String input) {
        System.out.println("Calling accept");
        System.out.println(input);
    }
}
