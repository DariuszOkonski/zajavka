package zajavka.week_04.summary.vehicle;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!Objects.equals(brand, car.brand)) return false;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
