package zajavka.week_03.day15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 2, 5, 2, 24, 11, 1, 54, 2, 6};
        System.out.println("Before: " + Arrays.toString(arr));
        bubbleSorting(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }

    public static void bubbleSorting(int[] array) {
        boolean isSorted = false;
        int size = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < (size - i); i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    swap(array, i);
                }
            }
        }
    }

    public static void swap(int[] array, int i) {
        int temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;
    }
}
