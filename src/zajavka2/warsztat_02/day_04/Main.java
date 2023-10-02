package zajavka2.warsztat_02.day_04;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorialRecursive(6));
    }

    public static Integer factorialRecursive(Integer value) {
        if(value == 1) {
            return 1;
        }

        return value * factorialRecursive(value - 1);
    }
}
