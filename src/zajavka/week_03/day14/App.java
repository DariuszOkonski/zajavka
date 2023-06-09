package zajavka.week_03.day14;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[][] matrix = createMatrix(4,6);
        printLargestNumberInRow(matrix);

    }
    private static void printLargestNumberInRow(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int largest = matrix[row][0];
            for (int column = 0; column < matrix[row].length; column++) {
                if(matrix[row][column] > largest) {
                    largest = matrix[row][column];
                }
            }
            System.out.println("Largest element in row: " + Arrays.toString(matrix[row]) + " largest: " + largest);
        }
    }

    private static void printSum(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
            System.out.println("Array: " + Arrays.toString(matrix[row]) + " sum: " + sum);

        }
    }
    private static void breakAndContinueExample(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if(row > 1) {
                    break;
                }
                System.out.println("Element[" + row + "][" + column + "]: " + matrix[row][column]);
            }
        }
        System.out.println("I am here");
    }
    private static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = generateRandomValue();
            }
        }

        return matrix;
    }

    private static int generateRandomValue() {
        int min = 0;
        int max = 10;
        return (int) ((Math.random() * (max - min) + 1)) + min;
    }
    private static void printArray(int[][] toPrint) {
        for (int row = 0; row < toPrint.length; row++) {
            for (int column = 0; column < toPrint[row].length; column++) {
                System.out.println("Element[" + row + "][" + column + "]: " + toPrint[row][column]);
            }
            System.out.println("===");
        }
    }
}
