package zajavka2.warsztat_01.ex11;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<?> animals = new ArrayList<>();
        List<? extends Animal> animals2 = new ArrayList<>();
        List<? super Animal> animals3 = new ArrayList<>();

        List<? super Dog> animals4 = new ArrayList<>();
        animals4.add(new Dog());

        List<?> animal6 = new ArrayList<>();
    }

    static <T> T method(T elment) {
        return elment;
    }
    static class Animal {}

    static class Dog extends Animal {}

    static class FlyingDog extends Dog {}
}
