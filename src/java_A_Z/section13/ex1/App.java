package java_A_Z.section13.ex1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Give me a number: ");
            int number1 = Integer.parseInt(scn.nextLine());
            System.out.println(20/number1);
        }
        catch (ArithmeticException ex) {
            System.out.println("Arithmetic: " + ex);
        }
        catch (NumberFormatException ex) {
            System.out.println("Number Format Exception: " + ex);
        }

        scn.close();
        System.out.println("more code...");
    }
}
