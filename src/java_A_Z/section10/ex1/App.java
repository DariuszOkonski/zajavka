package java_A_Z.section10.ex1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String[] names = { "Adam", "Kevin", "Joe" };
        Integer[] numbers = {10,20,30,40};
        printArray(names, numbers);
    }

    public static <T, V>void printArray(T[] t, V[] v) {
        for (T value : t) {
            System.out.println(value);
        }
        System.out.println("=======");
        for (V value : v) {
            System.out.println(value);
        }
    }
}
