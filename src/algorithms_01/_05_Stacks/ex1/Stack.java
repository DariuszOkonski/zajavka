package algorithms_01._05_Stacks.ex1;

public class Stack<T> {
    // te LIFO last item we inserted is the first one we take out
    // when the pop() method is called
    private Node<T> head;
    private int count;

    // 0(1)
    public void push(T data) {
        count++;
        // this is when the linked list is empty
        if(head == null) {
            head = new Node<>(data);
        } else {
            // the linkedlist already contains some items
            Node<T> oldHead = head;
            head = new Node<>(data);
            head.setNextNode(oldHead);
        }
    }

    // removes the last item we have inserted 0(1)
    public T pop() {
        if(isEmpty()) {
            return null;
        }

        T item = head.getData();
        head = head.getNextNode();
        count--;
        return item;
    }

    // 0(1)
    public int size() {
        return count;
    }

    // 0(1)
    public boolean isEmpty() {
        return count == 0;
    }


}
