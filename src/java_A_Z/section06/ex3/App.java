package java_A_Z.section06.ex3;

public class App {
    public static void main(String[] args) {
        // intern example
        String constantString = "Kevin";

        String newString = new String("Kevin");
        System.out.println(constantString == newString);
        System.out.println(constantString.equals(newString));
        System.out.println("===");

        newString = newString.intern();
        System.out.println(constantString == newString);
        System.out.println(constantString.equals(newString));
    }
}
