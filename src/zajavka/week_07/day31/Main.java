package zajavka.week_07.day31;

public class Main {
    public static void main(String[] args) {

        printSomething("Throws");
        printSomething("Throw");

    }

    private static void printSomething(final String input) {
        if("Throw".equalsIgnoreCase((input))) {
            throw new MyException();
        } else {
            System.out.println(input);
        }
    }
}

