package algorithms_01._06_Queues.ex4;

public class App {
    public static void main(String[] args) {
        MaxItemStack maxItemStack = new MaxItemStack();

        maxItemStack.push(10);
        maxItemStack.push(5);
        maxItemStack.push(12);
        maxItemStack.push(6);
        maxItemStack.push(7);
        maxItemStack.push(20);

        System.out.println(maxItemStack);
    }
}

