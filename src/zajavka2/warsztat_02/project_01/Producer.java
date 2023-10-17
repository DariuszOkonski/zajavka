package zajavka2.warsztat_02.project_01;

import java.util.function.Supplier;

public class Producer<T> {
    public Supplier<T> getSupplierImpl(T t) {
        return () -> t;
    }
}
