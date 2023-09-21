package zajavka2.warsztat_01.ex37.zad1;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        List<Car> myCarsList = List.of(
                new Car("Volvo", "V40", 2020),
                new Car("Volvo", "V60", 2010),
                new Car("Ford", "Focus", 2002)
        );

        List<Car> yourCarsList = List.of(
                new Car("Ford", "Focus", 2002),
                new Car("Audi", "A8", 2022),
                new Car("Dacia", "Duster", 2002)
        );

        Set<Car> ourCarsSet = new TreeSet<>(myCarsList);
        ourCarsSet.addAll(yourCarsList);

        for (Car car : ourCarsSet) {
            System.out.println(car);
        }
    }
}

