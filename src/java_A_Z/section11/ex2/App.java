package java_A_Z.section11.ex2;

import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Queue<AccessCard> queue = new PriorityQueue<>();
        queue.add(new AccessCard("card1", 5));
        queue.add(new AccessCard("card2", 3));
        queue.add(new AccessCard("card3", 7));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}

