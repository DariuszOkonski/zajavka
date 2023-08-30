package algorithms_01._06_Queues.ex5;

public class App {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(5);
        queue.enqueue(20);

        System.out.println(queue.dequeue());
        System.out.println("===");
        queue.enqueue(100);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}

