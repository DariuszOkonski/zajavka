package zajavka.week_06.day27ext;

public class App {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilder();
        House house = houseBuilder.buildHouse(5.0, "Zajavkowa 7/5, Grudziąc");

        System.out.println(house.getArea());
        System.out.println("Added some printing");
        System.out.println(house.getAddress());
    }
}

