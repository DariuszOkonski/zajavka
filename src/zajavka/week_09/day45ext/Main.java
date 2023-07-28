package zajavka.week_09.day45ext;

public class Main {
    public static void main(String[] args) {
        Jumpable jumpable = new Animal();
        jumpable.canJump();

        Jumpable jumpableLambda = () -> System.out.println("Lambda canJump invoked");

        jumpableLambda.canJump();
    }
}

