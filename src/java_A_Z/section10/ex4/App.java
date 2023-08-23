package java_A_Z.section10.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Number> list1 = new ArrayList<>();
        list1.add(5);

        addAndPrint(list1);
    }

    public static void addAndPrint(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
