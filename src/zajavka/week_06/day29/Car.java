package zajavka.week_06.day29;

public class Car {
    static long staticNumberOfCarsCreated;
    long numberOfCarsCreated;
    private final String company;
    private final String model;
    private final int productionYear;
    private final SteeringWheel steeringWheel;


    public Car() {
        this.company = "BMW";
        this.model = "X5";
        this.productionYear = 2020;
        this.steeringWheel = new SteeringWheel(0.35);
        staticNumberOfCarsCreated++;
        this.numberOfCarsCreated++;
    }

    @Override
    public String toString() {
        return "Car{" + "company='" + company + '\'' + ", model='" + model + '\'' + ", productionYear=" + productionYear + ", steeringWheel=" + steeringWheel + '}';
    }

    public void horn() {
        int i = 5;
        System.out.println("Car horn!");
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }
}

