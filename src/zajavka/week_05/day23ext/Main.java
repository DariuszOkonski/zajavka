package zajavka.week_05.day23ext;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Cat cat = (Cat) animal;

        Cat cat1 = new Cat();
        Animal animal1 = cat1;

        if (animal1 instanceof Dog) {
            Dog dog = (Dog) animal1;
        }

    }
}

