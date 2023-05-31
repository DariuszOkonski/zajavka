package zajavka.week_02.day9;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        String c = "String";

        String anotherValue = String.format("some value is: %s another value is: %s and again value is: %s",a,b,c);
        System.out.println(anotherValue);
    }
}
