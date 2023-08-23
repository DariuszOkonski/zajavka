package java_A_Z.section10.ex5;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        printAll(list1);
    }

    public static void printAll(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
