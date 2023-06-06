package zajavka.week_03.day11ext;

public class App {
    public static void main(String[] args) {
       int a = 3;

       String result = (a == 5) ? "piec" : "niepiec";
       String result2 = (a < 4) ? stringMethod1() : stringMethod2();

        System.out.println(result);
        System.out.println(result2);

    }

    public static String stringMethod1() {
        return "piec";
    }

    public static String stringMethod2() {
        return "niepiec";
    }
}
