package zajavka.week_03.day14ext;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[][] dim2 = {
                {11, 12, 13, 32},
                {14, 15, 16, 61},
                {17, 18, 19, 91},
                {10, 11, 12, 13}
        };

        System.out.println("Main diagonal sum = " + getMainDiagSum(dim2));
        System.out.println("Second diagonal sum = " + getSecDiagSum(dim2));
    }

    private static int getMainDiagSum(int[][] array) {
        int rowsSize = array.length;
        for (int[] row : array) {
            int colsSize = row.length;
            if (colsSize != rowsSize) {
                return -1;
            }
        }

        int sum = 0;
        for (int row = 0; row < rowsSize; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (row == col) {
                    sum += array[row][col];
                }
            }
        }

        return sum;
    }

    private static int getSecDiagSum(int[][] array) {
        int rowsSize = array.length;
        for (int[] row : array) {
            int colsSize = row.length;
            if (colsSize != rowsSize) {
                return -1;
            }
        }

        int sum = 0;
        for (int row = 0; row < rowsSize; row++) {
            for (int col = 0; col < array[row].length; col++) {
                int lastColIndex = array[row].length - 1;
                if (row == lastColIndex - col) {
                    sum += array[row][col];
                }
            }
        }

        return sum;
    }

}
