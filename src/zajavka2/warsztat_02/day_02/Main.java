package zajavka2.warsztat_02.day_02;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ILambda iLambda = (value, value2) -> {
            return value.length() + value2.length();
        };

        iLambda.countsChars("Zajavka", "hello");
    }
}

