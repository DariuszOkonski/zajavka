package zajavka.week_03.day13ext;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] array = {7, 9, 11, -1};

        for (int element: array) {
            System.out.println(element);
        }
    }

    private static void printArrayElements(int[] input) {
        System.out.print('[');
//        for (int i = 0; i < input.length; i++) {
//            System.out.print(input[i] + ((i != input.length - 1) ? ", " : ""));
//        }

        int i = 0;
        for (int element: input) {
            System.out.print(element + ((i != input.length - 1) ? ", " : ""));
            i++;
        }

        System.out.print(']');
    }
}
