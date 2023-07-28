package zajavka.week_09.day45ext;

public class Main {
    public static void main(String[] args) {
        Jumpable jumpable = new Animal();
        boolean jumping = jumpable.canJump("jumping");
        System.out.println(jumping);

        Jumpable jumpableLambda = initParam -> initParam.contains("jump");
        System.out.println("Lambda1: " + jumpableLambda.canJump("jumming"));
        System.out.println("Lambda2: " + jumpableLambda.canJump("jumping"));
    }
}

