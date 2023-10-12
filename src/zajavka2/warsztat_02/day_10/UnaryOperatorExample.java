package zajavka2.warsztat_02.day_10;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = str -> str;

        System.out.println(unaryOperator.apply("Hello"));
    }
}
