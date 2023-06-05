package zajavka.week_02.day10ext;

public class Main {
    public static void main(String[] args) {
        externalMethod(method1() + method2(method3() + method4()));


    }

    public static void externalMethod(int arg) {
        System.out.println("externalMethod");
        System.out.println("Result: " + arg);
    }

    private static int method1() {
        System.out.println("method1");
        return 1;
    }

    private static int method2(int i) {
        System.out.println("method2");
        return i;
    }

    private static int method3() {
        System.out.println("method3");
        return 3;
    }

    private static int method4() {
        System.out.println("method4");
        return 4;
    }
}
