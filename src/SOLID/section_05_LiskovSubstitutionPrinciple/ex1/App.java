package SOLID.section_05_LiskovSubstitutionPrinciple.ex1;

public class App {
    public static void main(String[] args) {

        Vehicle vehicle = new PetrolCar("Toyota", 6);
        vehicle.slowDown();
        vehicle.speedUp();
        vehicle.fuel();
    }
}

