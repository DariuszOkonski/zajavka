package DesignPatterns.section_11_FactoryPattern.ex2;

public class App {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("PETROL");
        factory.getCar("TOYOTA").assemble();
    }
}

