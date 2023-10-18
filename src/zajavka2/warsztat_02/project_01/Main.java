package zajavka2.warsztat_02.project_01;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> myFunction = Transformer.getFunctionImpl();
        Optional<Integer> myOptional = Optional.of("myString").map(myFunction);
        System.out.println(myOptional);


//        Producer<String> myProducer = new Producer<>();
//
//        Supplier<String> mySuppliers = myProducer.getSupplierImpl("myAwesomeString");
//        System.out.println(mySuppliers.get());
//
//        Consumer<String> myConsumer = myProducer.getConsumer();
//        myConsumer.accept("Consumed");
//
//        Function<String, String> myFunction = myProducer.getFunction("b");
//        System.out.println(myFunction.apply("a"));
    }
}

