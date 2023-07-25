package zajavka.week_08.day40;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> listWitchCities = new ArrayList<>();
        listWitchCities.add("Warsaw");
        listWitchCities.add("Gdansk");
        listWitchCities.add("Lodz");
        listWitchCities.add("Wroclaw");

        ListIterator<String> stringListIterator = listWitchCities.listIterator();
        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next());
        }
        System.out.println("===");
        while (stringListIterator.hasPrevious()) {
            System.out.println(stringListIterator.previous());
        }
    }
}
