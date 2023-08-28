package java_A_Z.section11.ex3;

import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.offerFirst(0);
        deque.offerFirst(-1);
        deque.offerLast(4);
        deque.offerLast(5);

        deque.removeLast();
        deque.removeFirst();

        for (Integer num : deque) {
            System.out.println(num);
        }
    }
}
