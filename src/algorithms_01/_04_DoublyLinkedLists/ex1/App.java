package algorithms_01._04_DoublyLinkedLists.ex1;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        DoublyLinkedList<String> names = new DoublyLinkedList<>();
//
//        names.insert("Adam");
//        names.insert("Kevin");
//        names.insert("Ana");
//        names.insert("Daniel");
//
//        names.traverseForward();
//        System.out.println("====");
//        names.traverseBackward();

        LinkedList<String> dll = new LinkedList<>();
        dll.addLast("Kevin");
        dll.addLast("Daniel");
        dll.addLast("Ana");

        for (String s : dll) {
            System.out.println(s);
        }


    }
}

