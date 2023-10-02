package zajavka2.warsztat_02.day_04;

public class App {
    public static void main(String[] args) {
        ISomeInterface someInstance = someStaticMethod(input -> System.out.println(input));
        someInstance.someMethod("Test 1");
    }

    static ISomeInterface someStaticMethod(ISomeInterface function) {
        function.someMethod("Some string");
        return otherInput -> System.out.println("returned: " + otherInput);
    }

    @FunctionalInterface
    interface ISomeInterface {
        void someMethod(String input);
    }
}
