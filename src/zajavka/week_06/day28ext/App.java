package zajavka.week_06.day28ext;

public class App {

    public static void main(String[] args) {
        System.out.println(Calculator.calculatorsSold);
        Calculator calc1 = new Calculator("Casio");
        Calculator calc2 = new Calculator("Panasonic");
        System.out.println(Calculator.calculatorsSold);

        calc1 = null;
        System.gc();

        System.out.println(Calculator.calculatorsSold);
    }
}

