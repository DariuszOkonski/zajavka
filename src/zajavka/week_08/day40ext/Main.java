package zajavka.week_08.day40ext;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Czarek");
        namesList.add("Marek");
        namesList.add("Darek");
        namesList.add("Arek");

        Cat cat = new Cat(namesList);
        System.out.println(cat);

        cat.getFriendsNames().add("Jarek");
        System.out.println(cat);

        namesList.add("Ogarek");
        System.out.println(cat);
    }
}

