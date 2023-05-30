package algorithms_01._02_ArraysQuestions.ex1;

import java.util.Arrays;

public class MyAnswer {
    public static void main(String[] args) {
        int[] someArray = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(someArray));
        System.out.println(Arrays.toString(solution(someArray)));
    }

    public static int[] solution(int[] numbers) {
        int lowIndex = 0;
        int highIndex = numbers.length - 1;

        while (lowIndex < highIndex) {
            swap(numbers, lowIndex, highIndex);
            lowIndex++;
            highIndex--;
        }

        return numbers;
    }

    private static void swap(int[] numbers, int lowIndex, int highIndex) {
        int temp = numbers[lowIndex];
        numbers[lowIndex] = numbers[highIndex];
        numbers[highIndex] = temp;
    }
}
