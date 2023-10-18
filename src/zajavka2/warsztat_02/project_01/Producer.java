package zajavka2.warsztat_02.project_01;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Producer<T> {
    public Supplier<T> getSupplierImpl(T t) {
        return () -> t;
    }

    public Consumer<T> getConsumer() {
        return u -> {
            System.out.println("Consumer: " + u);
        };
    }

    public Function<T, T> getFunction(T t) {
        return u -> t.toString().compareTo(u.toString()) > 0 ? u : t;
    }
}
