package zajavka.week_03.day13ext;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] array = new int[]{7, 9, 11, -1, 15};

        System.out.println("avg = " + getAverageValue(array));
    }

    private static double getAverageValue(int[] array) {
        int sum = 0;
        for (int element: array) {
            sum += element;
        }

        System.out.println("sum = " + sum);
        return ((double)sum / array.length);
    }

}
