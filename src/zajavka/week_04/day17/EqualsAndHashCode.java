package zajavka.week_04.day17;

import java.math.BigDecimal;

class EqualsAndHashCode {
    public static void main(String[] args) {
//        decimalTypesComparison();
        equalsExample();
    }

    private static void decimalTypesComparison() {
        BigDecimal bd3 = new BigDecimal("0.3");
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        System.out.println(bd3 == bd1.add(bd2));
        System.out.println(bd3.equals(bd1.add(bd2)));
    }

    private static void equalsExample() {
        Car car1 = new Car("Mercedes", "A-Class", 2010);
        Car car2 = new Car("BMW", "X1", 2009);
        Car car3 = new Car("Volkswagen", "Golf", 2015);
        Car car4 = new Car("Audi", "A4", 2018);
        Car car5 = new Car("Audi", "A4", 2020);

        System.out.println(car4 == car5);
        System.out.println(car4.equals(car5));

    }
}
