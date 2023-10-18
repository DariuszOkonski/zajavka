package zajavka2.warsztat_02.project_01;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        MyConsumer myConsumer = new MyConsumer();
        myConsumer.consumeConsumer(System.out::println);
        myConsumer.consumeSupplier(() -> "123");
        myConsumer.consumeFunction(Object::toString);

        Function<String, Integer> myFunction = Transformer.getFunctionImpl();
        Optional<Integer> myOptional = Optional.of("myString").map(myFunction);
        System.out.println(myOptional);

        UnaryOperator<BigDecimal> myUnaryOperator = Transformer.getUnaryOperatorImpl();
        Optional<BigDecimal> myResult = Optional.of(BigDecimal.valueOf(3.14)).map(myUnaryOperator);
        System.out.println(myResult);


        Producer<String> myProducer = new Producer<>();

        Supplier<String> mySuppliers = myProducer.getSupplierImpl("myAwesomeString");
        System.out.println(mySuppliers.get());

        Consumer<String> myConsumer2 = myProducer.getConsumer();
        myConsumer2.accept("Consumed");

        Function<String, String> myFunction2 = myProducer.getFunction("b");
        System.out.println(myFunction2.apply("a"));
    }
}

