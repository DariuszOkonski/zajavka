package zajavka.week_05.day22ext.interfaces;

public class App {
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();

        runAnimal(ostrich);
    }

    public static void runAnimal(Animal animal) {
        animal.run();
        animal.swim();
        animal.live();
    }
}

