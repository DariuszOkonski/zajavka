package zajavka2.warsztat_02.day_10;

import java.util.Optional;
import java.util.function.Function;

public class FunctionalExample {
    public static void main(String[] args) {
        Optional<String> carOptional = Optional.of(new Car()).map(Car::toString);

        Function<Car, String> funcionImpl = c -> {
            System.out.println(c);
            return "someString";
        };

        funcionImpl.apply(new Car());
    }

    static class Car {

    }
}
