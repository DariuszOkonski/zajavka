package zajavka2.warsztat_01.ex12_Generics_ex.ex3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,5,6,11,12));

        int result1 = exercise3(set, el -> el % 2 != 0);
        int result2 = exercise3(set, el -> el % 2 == 0);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
    }

    public static<T> int exercise3(Collection<T> collection, Predicate<T> predicate) {
        int counter = 0;
        for (T element : collection) {
            if(predicate.test(element)) {
                counter++;
            }
        }
        return counter;
    }

//    public static<T extends Collection<E>, E, F extends Predicate<E>> int exercise3(T collection, F predicate) {
//        int counter = 0;
//        for (E element : collection) {
//            if(predicate.test(element)) {
//                counter++;
//            }
//        }
//        return counter;
//    }
}
