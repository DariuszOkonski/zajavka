package SOLID.section_03_SingleResponsibilityPrinciple.ex1;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        Pair pair = InputProcessor.process();

        if(!ViolationChecker.isValid(pair)) {
            System.out.println("One of the input is invalid");
            return;
        }

        int firstNumber = Integer.parseInt(pair.getFirst());
        int secondNumber = Integer.parseInt(pair.getSecond());

        int result = Operation.execute(firstNumber, secondNumber);

        System.out.println("The result is: " + result);
        System.out.println("End of the application!");
    }
}

