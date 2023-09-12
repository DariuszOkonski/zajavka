package SOLID.section_03_SingleResponsibilityPrinciple.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final int THRESHOLD = 5;
    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        List<Integer> nums = getInput();

        sort(nums);

        show(nums);

        System.out.println("Application is ended!");
    }

    private static void show(List<Integer> nums) {
        for (Integer num : nums) {
            System.out.print(num+"");
        }
    }

    private static void sort(List<Integer> nums) {
        Collections.sort(nums);
    }

    private static List<Integer> getInput() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter 5 valid integers int the range [0, 10]");

        while (nums.size() < THRESHOLD) {
            String s = scanner.nextLine();

            if(!isValid(s))
                continue;

            nums.add(Integer.valueOf(s));
        }
        scanner.close();

        return nums;
    }

    private static boolean isValid(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            return false;
        }

        int num = Integer.parseInt(input);

        if(num<0 || num>10) {
            return false;
        }

        return true;
    }
}
