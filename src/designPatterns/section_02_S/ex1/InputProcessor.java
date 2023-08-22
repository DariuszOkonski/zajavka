package designPatterns.section_02_S.ex1;

import java.util.Scanner;

public class InputProcessor {
    public static Pair process() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String firstNumber = scanner.nextLine();

        System.out.println("Enter the second number: ");
        String secondNumber = scanner.nextLine();

        Pair pair = new Pair(firstNumber, secondNumber);

        scanner.close();

        return pair;
    }
}
