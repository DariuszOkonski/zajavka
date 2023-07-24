package zajavka.week_08.day36;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> citiesList = new ArrayList<>();

        citiesList.add("Warsaw");
        citiesList.add("Gdansk");
        citiesList.add("Wroclaw");
        citiesList.add("Szczecin");
        System.out.println(citiesList);
        System.out.println(citiesList.remove(1));
        System.out.println(citiesList);

    }
}
