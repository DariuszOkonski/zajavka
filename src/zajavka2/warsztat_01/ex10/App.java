package zajavka2.warsztat_01.ex10;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());

        anotherFlyingDog(dogs);
        anotherFlyingDog(animals);

        List<? super Dog> list1 = dogs;
        List<? super Dog> list2 = animals;

        list1.add(new Dog());
        list1.add(new FlyingDog());
    }

    private static void anotherFlyingDog(List<? super Dog> list) {
        list.add(new FlyingDog());
    }

    static class Animal {}

    static class Dog extends Animal {

    }

    static class FlyingDog extends Dog {

    }

}
