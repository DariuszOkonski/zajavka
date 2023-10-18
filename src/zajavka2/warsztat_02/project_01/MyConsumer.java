package zajavka2.warsztat_02.project_01;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MyConsumer {

    public void consumeConsumer(Consumer<String> c) {
        c.accept("myArg");
    }

    public void consumeSupplier(Supplier<?> supplier) {
        System.out.println(supplier.get());
    }

    public void consumeFunction(Function<Integer, String> function) {
        System.out.println(function.apply(321));
    }
}
