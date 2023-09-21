package zajavka2.warsztat_01.ex37.zad1;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparable<Car> {
    private final String brand;
    private final String model;
    private final Integer year;

    public Car(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!Objects.equals(brand, car.brand)) return false;
        if (!Objects.equals(model, car.model)) return false;
        return Objects.equals(year, car.year);
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Car car) {
//        Comparator<Car> carComparatorYear = (o1, o2) -> o1.year - o2.year;
//        Comparator<Car> carComparatorBrandYear = carComparatorYear.thenComparing((o1, o2) -> o1.brand.compareTo(o2.brand));
//        Comparator<Car> carComparatorModelBrandYear = carComparatorBrandYear.thenComparing((o1, o2) -> o1.model.compareTo(o2.model));

//        Comparator<Car> carComparatorYear = Comparator.comparingInt(o -> o.year);
//        Comparator<Car> carComparatorBrandYear = carComparatorYear.thenComparing(Comparator.comparing(o -> o.brand));
//        Comparator<Car> carComparatorModelBrandYear = carComparatorBrandYear.thenComparing(Comparator.comparing(o -> o.model));

        return Comparator.<Car>comparingInt(o2 -> o2.year)
                .thenComparing(o1 -> o1.brand)
                .thenComparing(o -> o.model)
                .compare(this, car);
    }
}
