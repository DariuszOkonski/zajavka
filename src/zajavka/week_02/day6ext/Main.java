package zajavka.week_02.day6ext;

import zajavka.week_02.day6ext.plant.Plant;

public class Main {
    public static void main(String[] args) {
        Plant plant1 = new Plant("red", 24);
        Plant plant2 = new Plant("green", 165);

        System.out.println(plant1);
        System.out.println(plant2);



        plant1.rise();
    }
}
