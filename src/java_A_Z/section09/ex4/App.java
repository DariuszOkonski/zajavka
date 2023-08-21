package java_A_Z.section09.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Adam");
        list.add("Kate");
        list.add("Joe");
        list.add("Kevin");
        list.add("Daniel");


        System.out.println(Arrays.toString(list.toArray()));
        list.remove(0);
        list.add(1, "Second Joe");
        list.set(0, "Adammmmm");
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        Collections.sort(list);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
