package java_A_Z.section11.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // adding object in ArrayList
        arrayList.add("Kevin");
        arrayList.add("Joe");
        arrayList.add("Peter");

        // adding object in LinkedList
        linkedList.add("Kate");
        linkedList.add("Judy");
        linkedList.add("Julia");

        // iterate through with Iterator
        Iterator<String> arrayIterator = arrayList.iterator();
        System.out.println("ArrayList elements: ");
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
        System.out.println("====");

        Iterator<String> linkedListIterator = linkedList.iterator();
        System.out.println("LinkedList elements:");
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }
    }
}
