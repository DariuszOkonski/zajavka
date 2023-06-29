package zajavka.week_06.day27ext;

public class House {
    private double area;
    private String address;
    public House(double area, String address) {
        constructArea(area);
        assignAddress(address);
    }

    private void assignAddress(String address) {
        this.address = address;
    }

    private void constructArea(double area) {
        System.out.println("Construction area...");
        buildWalls(8);
        if (area > 0 && area < 10) {
            this.area = area * 3;
        } else  {
            this.area = area;
        }
        System.out.println("Area constructed.");
    }

    private void buildWalls(int bricksAmount) {
        for (int i = 0; i < bricksAmount; i++) {
            System.out.println("Building brick no: " + i);
        }
        System.out.println("Walls built");
    }

    public double getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", address='" + address + '\'' +
                '}';
    }
}
