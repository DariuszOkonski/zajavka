package zajavka.week_04.day17;

public class MethodsOverloading {
    private void overloadedMethod(String arg1, String arg2) {
        System.out.println("String arg1 + String arg2: " + arg1 + arg2);
    }

    private void overloadedMethod(String arg1, String arg2, String arg3) {
        System.out.println("String arg1 + String arg2 + String arg3: " + arg1 + arg2 + arg3);
    }
}
