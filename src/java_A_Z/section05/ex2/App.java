package java_A_Z.section05.ex2;

public class App {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1.1, 1.2));
    }

    public static int add(int num1, int num2) {
        System.out.println("Adding two integers...");
        return  num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        System.out.println("Adding three integers...");
        return num1 + num2 + num3;
    }

    public static double add(double num1, double num2) {
        System.out.println("Adding two doubles... ");
        return num1 + num2;
    }
}
