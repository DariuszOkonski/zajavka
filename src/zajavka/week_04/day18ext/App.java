package zajavka.week_04.day18ext;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Building[] buildings = new Building[5];
        buildings[0] = new Hotel();
        buildings[1] = new House();

        System.out.println(Arrays.toString(buildings));

        buildings[0].print();
        buildings[1].print();
    }
    public static void accept(Building house) {
        house.print();
    }
}

