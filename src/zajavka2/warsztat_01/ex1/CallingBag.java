package zajavka2.warsztat_01.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CallingBag {
    public static void main(String[] args) {
//        Bag<String> bag = new Bag<>();
//
//        System.out.println(bag);
//        bag.pack("string element");
//        System.out.println(bag);
//        bag.empty();
//        System.out.println(bag);
//
//        System.out.println("==============");
//        Bag<Car> carBag = new Bag<>();
//        System.out.println(carBag);
//        carBag.pack(new Car());
//        System.out.println(carBag);
//        carBag.empty();
//        System.out.println(carBag);
//
//        System.out.println("=============");
//        List<Car> cars = new ArrayList<>();
//        cars.add(new Suv());
//        System.out.println(cars);

        callFilteringBag();
    }

    private static void callFilteringBag() {
        Car car = new Car("red", 2020);
        FilteringBag<Car, Predicate<Car>, Predicate<Car>> filteringBag = new FilteringBag<>(
                c -> c.getColor().equals("red"),
                c -> c.getYear().equals(2020)
        );

        filteringBag.pack(car);

    }

    static class Car {
        private String color;
        private Integer year;

        public Car(String color, Integer year) {
            this.color = color;
            this.year = year;
        }

        public Integer getYear() {
            return year;
        }

        public String getColor() {
            return color;
        }
    }
}
