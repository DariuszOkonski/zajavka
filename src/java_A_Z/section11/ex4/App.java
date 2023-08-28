package java_A_Z.section11.ex4;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(100);
        hashSet.add(22);
        hashSet.add(3);
        hashSet.add(40);
        hashSet.add(51);
        hashSet.add(29);

        Set<Integer> sortedSet = new TreeSet<>(hashSet);

//        System.out.println(hashSet.contains(100));
//        hashSet.remove(10);

//        for (Integer num : hashSet) {
//            System.out.println(num);
//        }

        System.out.println(Collections.unmodifiableSet(sortedSet));
        System.out.println(Collections.unmodifiableSet(hashSet));
    }
}
