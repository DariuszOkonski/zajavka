package zajavka.week_04.day17ext;

public class App {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator("Sony");
        Calculator calculator2 = new Calculator("Sony");

        System.out.println(calculator1 == calculator2);
        System.out.println(calculator1.equals(calculator2));
    }
}

