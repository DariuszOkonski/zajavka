package zajavka2.warsztat_02.ex_03;

public class Vehicle implements Comparable<Vehicle>{
    private final int numberOfWheels;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public int compareTo(Vehicle vehicle) {
        return this.numberOfWheels - vehicle.numberOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numberOfWheels=" + numberOfWheels +
                '}';
    }
}
