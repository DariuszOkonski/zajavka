package zajavka2.warsztat_02.day_10;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator  = String::concat;

        System.out.println(binaryOperator.apply("Hello ", "World"));
    }
}
