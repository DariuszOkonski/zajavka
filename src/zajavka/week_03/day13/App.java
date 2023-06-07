package zajavka.week_03.day13;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        arraysExample();
    }

    private static void arraysExample() {
        double[] array = new double[] {1.0, 2.0, 3.72, 3.0, 9.34, 1.29, 2.55, 1.23894};

        // total
        double total = 0;
        for (double element: array) {
            total += element;
        }
        System.out.println("Total: " + total);

        // max
        double maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > maximum) {
                maximum = array[i];
            }
        }
        System.out.println("Max: " + maximum);
    }
}
