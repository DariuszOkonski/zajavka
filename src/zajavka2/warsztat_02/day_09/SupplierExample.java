package zajavka2.warsztat_02.day_09;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = SupplierExample::gimme;

        System.out.println(supplier.get());
    }

    private static int gimme() {
        System.out.println("Supply");
        return 457;
    }
}
