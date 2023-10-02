package zajavka2.warsztat_02.day_05;

public class App {
    public static void main(String[] args) {
        SomeFunctionalInterface impl = (arg1 -> {
            System.out.println("Calling our functional interface: " + arg1);
        });
        impl.consume("hi");
    }
}

