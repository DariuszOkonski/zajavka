package zajavka2.warsztat_02.project_01;

public class Main {
    public static void main(String[] args) {
        MyConsumer myConsumer = new MyConsumer();
        myConsumer.consumeConsumer(System.out::println);
        myConsumer.consumeSupplier(() -> "123");
        myConsumer.consumeFunction(Object::toString);

//        Function<String, Integer> myFunction = Transformer.getFunctionImpl();
//        Optional<Integer> myOptional = Optional.of("myString").map(myFunction);
//        System.out.println(myOptional);
//
//        UnaryOperator<BigDecimal> myUnaryOperator = Transformer.getUnaryOperatorImpl();
//        Optional<BigDecimal> myResult = Optional.of(BigDecimal.valueOf(3.14)).map(myUnaryOperator);
//        System.out.println(myResult);


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

