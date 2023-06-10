package zajavka.week_03.day15ext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1, 5, 3, 1, 55, 5};
        printIndexOfArraysElement(array, 5);

        printUniversalMultiplicationResult(1,2,3,4);
        printUniversalMultiplicationResult(1,2,3,4,5,6);

    }
    private static void printUniversalMultiplicationResult(int... args) {
        int result = 1;
        for (int arg : args) {
            result *= arg;
        }
        System.out.println("Result: " + result);
    }

    private static void printIndexOfArraysElement(int[] array, int element) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == element) {
                System.out.println(index);
                return;
            }
        }
    }


}
