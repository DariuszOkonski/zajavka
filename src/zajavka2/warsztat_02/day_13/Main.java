package zajavka2.warsztat_02.day_13;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> integerStringFunction = i -> {
            if(i > 0) {
                throw  new MyException(i + "greater than 0!");
            } else {
                return i.toString();
            }
        };

        System.out.println(integerStringFunction.apply(0));
        System.out.println(integerStringFunction.apply(1));

    }
}

