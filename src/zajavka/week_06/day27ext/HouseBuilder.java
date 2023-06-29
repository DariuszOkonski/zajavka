package zajavka.week_06.day27ext;


public class HouseBuilder {

    public HouseBuilder() {
    }

    public House buildHouse(double area, String address) {
        return new House(area, address);
    }
}
