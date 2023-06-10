package zajavka.week_03.day15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 2, 5, 2};
        System.out.println("Before: " + Arrays.toString(arr));
        bubbleSorting(arr);
        System.out.println("After: " + Arrays.toString(arr));

//        int result = Arrays.binarySearch(arr, 6);
//        System.out.println(result);
    }

    public static void bubbleSorting(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    swap(array, i);;
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
