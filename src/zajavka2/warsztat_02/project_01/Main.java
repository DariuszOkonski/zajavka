package zajavka2.warsztat_02.project_01;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // 11:00 min
        Producer<String> myProducer = new Producer<>();
        Supplier<String> mySuppliers = myProducer.getSupplierImpl("myAwesomeString");
        System.out.println(mySuppliers.get());
    }
}

