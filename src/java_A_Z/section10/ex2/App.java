package java_A_Z.section10.ex2;

public class App {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>(100);
        System.out.println(box1.getElement());

        Box<String> box2 = new Box<>("Adam");
        System.out.println(box2.getElement());
    }
}