package java_A_Z.section06.ex2;

public class App {
    public static void main(String[] args) {
        String n1 = "Kevin";
        String n2 = "Kevin";
        String n3 = new String("Kevin");
        String n4 = new String("Kevin");
        String n5 = new String("Peter");

        System.out.println("n1 == n2: " + (n1 == n2));
        System.out.println("n1.equals(n3): " + (n1.equals(n3)));
        System.out.println("===");

        System.out.println("n2 == n3: " + (n2 == n3));
        System.out.println("n2.equals(n3): " + (n2.equals(n3)));
        System.out.println("===");

        System.out.println("n3 == n4: " + (n3 == n4));
        System.out.println("n3.equals(n4): " + (n3.equals(n4)));
        System.out.println("===");

        System.out.println("n4 == n5: " + (n4 == n5));
        System.out.println("n4.equals(n5): " + (n4.equals(n5)));
    }
}
