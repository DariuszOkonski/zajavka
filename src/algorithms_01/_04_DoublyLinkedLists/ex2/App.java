package algorithms_01._04_DoublyLinkedLists.ex2;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        final int NUMBER_OF_ITERATION = 500000;
        ArrayList<Integer> array = new ArrayList<>();

        long now = System.currentTimeMillis();
        for (int i = 0; i < NUMBER_OF_ITERATION; i++) {
            array.add(i);
        }
        System.out.println("Time taken for ArrayList: " + (System.currentTimeMillis() - now));

        LinkedList<Integer> list = new LinkedList<>();
        now = System.currentTimeMillis();
        for (int i = 0; i < NUMBER_OF_ITERATION; i++) {
            list.addFirst(i);
        }
        System.out.println("Time taken for LinkedList: " + (System.currentTimeMillis() - now));
    }
}
