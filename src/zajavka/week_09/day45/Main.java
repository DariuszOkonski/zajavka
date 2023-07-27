package zajavka.week_09.day45;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = List.of(
                new Animal("dog", false, true),
                new Animal("fish", false, false),
                new Animal("bird", true, false)
        );

        print(animals, a -> a.isCanBark());
        print(animals, a -> a.isCanFly());
    }

    private static void print(final List<Animal> animals, final Chackable checker) {
        for(Animal animal: animals) {
            if(checker.test(animal)) {
                System.out.println(animal);
            }
        }
    }
}
