package algorithms_01._06_Queues.ex3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(10);
        queue.offer(100);
        queue.offer(1000);
        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println("--------");

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(10);
        stack.push(100);
        stack.push(1000);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
