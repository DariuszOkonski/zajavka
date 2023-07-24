package zajavka.week_07.summary;

public class Main {
    public static void main(String[] args) {
        System.out.println("Printing Before");

        try {
            someOtherMethod();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Printing After");
    }

    private static void someOtherMethod() throws RuntimeException {
        throw new RuntimeException("Some error");
    }
}
