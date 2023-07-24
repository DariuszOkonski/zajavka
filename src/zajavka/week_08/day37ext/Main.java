package zajavka.week_08.day37ext;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deque<String> listOfStrings = new LinkedList<>();

        listOfStrings.addFirst("First");
        listOfStrings.addLast("Last");

        System.out.println(listOfStrings);
    }
}
