package zajavka.week_07.day31;

public class Main {
    public static void main(String[] args) {

        try {
            printSomething("Throw");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            printSomething("Throws");
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    private static void printSomething(final String input) throws MyException {
        if("Throw".equalsIgnoreCase((input))) {
            throw new MyException();
        } else {
            System.out.println(input);
        }
    }
}

