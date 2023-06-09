package java_A_Z.section05.ex1;

public class House {
    private int numOfRooms;
    private int numOfDoors;
    private int numOfWindows;

    public House() {
        this(1);
    }

    public House(int numOfRooms) {
        this(numOfRooms, 10);
    }

    public House(int numOfRooms, int numOfDoors) {
        this(numOfRooms, numOfDoors, 20);
    }

    public House(int numOfRooms, int numOfDoors, int numOfWindows) {
        this.numOfRooms = numOfRooms;
        this.numOfDoors = numOfDoors;
        this.numOfWindows = numOfWindows;
    }

    public House(double area, String address) {
    }

    @Override
    public String toString() {
        return "House{" +
                "numOfRooms=" + numOfRooms +
                ", numOfDoors=" + numOfDoors +
                ", numOfWindows=" + numOfWindows +
                '}';
    }
}
