package zajavka.week_06.day28ext;

public class Calculator {
    private static final double PI = 3.14;
    public static int calculatorsSold;
    private final String model;

    public Calculator(String model) {
        this.model = model;
        calculatorsSold++;
    }

    @Override
    protected void finalize() throws Throwable {
        calculatorsSold--;
    }

    public static double calculateCircleArea(double radius) {
        return PI * Math.pow(radius, 2);
    }
}
