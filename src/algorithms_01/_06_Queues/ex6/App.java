package algorithms_01._06_Queues.ex6;

public class App {
    public static void main(String[] args) {
        OneStackQueue oneStackQueue = new OneStackQueue();

        oneStackQueue.enqueue(10);
        oneStackQueue.enqueue(5);
        oneStackQueue.enqueue(20);

        System.out.println(oneStackQueue.dequeue());
        System.out.println("====");

        oneStackQueue.enqueue(100);

        System.out.println(oneStackQueue.dequeue());
        System.out.println(oneStackQueue.dequeue());
        System.out.println(oneStackQueue.dequeue());
    }
}

