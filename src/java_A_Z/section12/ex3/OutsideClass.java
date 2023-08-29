package java_A_Z.section12.ex3;

public class OutsideClass {
    private static String msg = "Hello world!";

    static class NestedClass {
        public void showMsg() {
            System.out.println(msg);
        }
    }
}
