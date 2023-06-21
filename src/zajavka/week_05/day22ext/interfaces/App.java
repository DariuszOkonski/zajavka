package zajavka.week_05.day22ext.interfaces;

public class App {
    public static void main(String[] args) {
        Animal[] animals = new Animal[20];


        for (int i = 0; i < animals.length; i++) {
            double random = Math.random();

            if(random < 0.3) {
                animals[i] = new Mouse();
            } else if(random < 0.6) {
                animals[i] = new Dog();
            } else {
                animals[i] = new Ostrich();
            }
        }

        for (Animal animal : animals) {
            runAnimal(animal);
        }
    }

    public static void runAnimal(Animal animal) {
        animal.fly();
        System.out.println("------");
    }
}

