package zajavka2.warsztat_02.ex_03;

import zajavka2.warsztat_02.day_13.MyException;

import java.util.Optional;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Vehicle> binaryOperatorImpl = (v1, v2) -> {
            int comparisonResult = v1.compareTo(v2);
            if(comparisonResult == 0) {
                return null;
            }
            return comparisonResult > 0 ? v1 : v2;
        };

        Vehicle vehicle = Optional
                .ofNullable(binaryOperatorImpl.apply(new Vehicle(4), new Vehicle(2)))
                .orElseThrow(() -> {
                    throw new RuntimeException();
                });

        System.out.println(vehicle);
    }
}

