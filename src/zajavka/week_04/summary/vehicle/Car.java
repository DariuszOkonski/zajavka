package zajavka.week_04.summary.vehicle;

public class Car {
    String brand;
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void drive() {
        System.out.println("driving: " + this.brand + " " + this.model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
