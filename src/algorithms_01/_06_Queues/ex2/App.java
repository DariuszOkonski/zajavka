package algorithms_01._06_Queues.ex2;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//
//        // add() method inserts a new item into the queue in 0(1)
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//
//        System.out.println(queue);
//        System.out.println(queue.element());
//        System.out.println(queue);
//
//        while (!queue.isEmpty()) {
//            System.out.println(queue.remove());
//        }

        Queue<Task> tasks = new LinkedList<>();
        tasks.add(new Task(1));
        tasks.add(new Task(2));
        tasks.add(new Task(3));
        tasks.add(new Task(4));

        while (!tasks.isEmpty()) {
            Task task = tasks.remove();
            task.execute();
        }
    }
}
