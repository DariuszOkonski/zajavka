package SOLID.section_05_LiskovSubstitutionPrinciple.ex1;

public class ElectricCar extends Vehicle {
    public ElectricCar(String type, int age) {
        super(type, age);
    }

    @Override
    protected void speedUp() {
        System.out.println("ElectricCar is speeding up...");
    }

    @Override
    protected void slowDown() {
        System.out.println("ElectricCar is slowing down...");
    }

    @Override
    public void fuel() {
        System.out.println("Electric car is being charged...");
    }
}
