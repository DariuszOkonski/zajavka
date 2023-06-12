package zajavka.week_04.day18;

public class App {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.company);
        System.out.println(car.model);
        System.out.println(car.horn());
    }

    public static void AutoBoxing(String[] args) {
        String a = "12";
        int b = Integer.parseInt(a);
        System.out.println(b);
        System.out.println("===");

        Integer num1 = 10;
        Integer num2 = 0;

        num2 += num1;

        System.out.println(num2);
    }
}

