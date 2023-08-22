package java_A_Z.section10.ex3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        print(numbers);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.2);
        doubles.add(2.2);
        doubles.add(2.3);
        print(doubles);
    }

    public static void print(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.println(number);
        }
    }
//    public static <T>void print(T[] t) {
//        for (T value : t) {
//            System.out.println(value);
//        }
//    }
}
