package zajavka.week_06.day29;

public class Car {
    private String company;
    private String model;
    private int productionYear;

    private SteeringWheel steeringWheel;

    public Car() {
        this.company = "BMW";
        this.model = "X5";
        this.productionYear = 2020;
        this.steeringWheel = new SteeringWheel(0.35);
    }

    public void horn() {
        System.out.println("Car horn!");
    }
}

