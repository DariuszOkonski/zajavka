package DesignPatterns.section_11_FactoryPattern.ex2;

public class ElectricFord implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling an electric Ford...");
    }
}