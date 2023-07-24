package zajavka.week_08.day37;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Warsaw");
        linkedList.add("Gdansk");
        linkedList.add("Wroclaw");

        System.out.println(linkedList);

        linkedList.add(2, "Bialystok");
        System.out.println(linkedList);
    }
}
