package java_A_Z.section13.ex2;

public class App {
    public static void main(String[] args) {
        try {
            int exampleArray[] = {1,2,3,4,5};
            System.out.println(exampleArray[9]);

            try {
                int x = exampleArray[3] / 0;
                System.out.println("Result of division: " + x);
            } catch (ArithmeticException e2) {
                System.out.println("ArithmeticException - Division by zero is not possible");
            }

        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("ArrayIndexOutOfBoundsException - Element at such index does not exists");
        }

        System.out.println("The application does not freeze ...");
    }
}
