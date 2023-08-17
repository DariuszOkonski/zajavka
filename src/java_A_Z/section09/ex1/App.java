package java_A_Z.section09.ex1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] names = {"Adam", "Kevin", "Joe"};

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("===");

        int[] numbers = {1,5,3,-2,10,8};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
