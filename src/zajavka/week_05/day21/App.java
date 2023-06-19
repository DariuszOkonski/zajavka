package zajavka.week_05.day21;

public class App {
    public static void main(String[] args) {
        Car car = new Car("BMW", null, 2019);

        System.out.println(car.getCompany());
        System.out.println(car.getModel());
        System.out.println(car.getProductionYear());

        car.setCompany("brak");
        car.setModel("GLA");
        car.setProductionYear(2020);

        System.out.println("---");

        System.out.println(car.getCompany());
        System.out.println(car.getModel());
        System.out.println(car.getProductionYear());
    }
}



