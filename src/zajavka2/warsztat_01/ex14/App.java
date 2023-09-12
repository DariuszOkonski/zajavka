package zajavka2.warsztat_01.ex14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(1,"Roman"));
        dogs.add(new Dog(2,"Stefan"));
        dogs.add(new Dog(3,"Niko"));
        dogs.add(new Dog(4,"Roman"));
        dogs.add(new Dog(5,"Fafik"));
        dogs.add(new Dog(6, "Burek"));

        System.out.println(Collections.unmodifiableList(dogs));
        Collections.sort(dogs);
        System.out.println(Collections.unmodifiableList(dogs));
    }
}

