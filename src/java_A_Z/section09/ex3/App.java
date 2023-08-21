package java_A_Z.section09.ex3;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        sum(1,2,3,4);
    }

    public static void sum(int ...numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("sum: " + sum);
    }
}
