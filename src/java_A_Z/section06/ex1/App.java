package java_A_Z.section06.ex1;

public class App {
    public static void main(String[] args) {
        String name1 = "Kevin";
        String name2 = "Kevin";
        String name3 = "Kevin";

        String name4 = new String("Kevin");
        String name5 = new String("Kevin");

        String name6 = "Kevin";

        System.out.println(System.identityHashCode(name1));
        System.out.println(System.identityHashCode(name2));
        System.out.println(System.identityHashCode(name3));
        System.out.println("---");
        System.out.println(System.identityHashCode(name4));
        System.out.println(System.identityHashCode(name5));
        System.out.println("---");
        System.out.println(System.identityHashCode(name6));

    }
}
