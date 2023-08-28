package java_A_Z.section12.ex2;

public class OutsideClass {
    private String message = "Hello world!";

    class InnerClass {
        public void showMessage() {
            System.out.println(message);
        }
    }
}
