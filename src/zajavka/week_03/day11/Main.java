package zajavka.week_03.day11;

public class Main {
    public static void main(String[] args) {
//        calculation1(5, 7);
//        calculation2();
//        calculation3();
    }
    public static void  calculation3() {
        byte x = 0;
        System.out.println((int)x);
        System.out.println((long)x);
        System.out.println((float) x);
        System.out.println((double) x);
    }
    public static void  calculation2() {
        int x = 0;
        System.out.println("x == x: " + (x == x));
        System.out.println("x != x: " + (x != x));
        System.out.println("x++: " + (x++));
        System.out.println("x-= x: " + (x-=x));
        System.out.println("x*= x: " + (x*=x));
    }
    public static void calculation1(double number1, double number2) {
        System.out.println("Task 1");
        System.out.println("Sum: " + (number1 + number2));
        System.out.println("Odd: " + (number1 - number2));
        System.out.println("Mul: " + (number1 * number2));
        System.out.println("Div: " + (number1 / number2));
    }
}
