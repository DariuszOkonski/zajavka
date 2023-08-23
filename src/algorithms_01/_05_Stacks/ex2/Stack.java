package algorithms_01._05_Stacks.ex2;

public class Stack<T> {
    private T[] stack;
    private int count;

    public Stack() {
        stack = (T[]) new Object[1];
    }

    // we just have to add the new item to the end of the array 0(1)
    public void push(T newData) {
        if(count == stack.length) {
            resize(2*count);
        }

        stack[count++] = newData;
    }

    // returns the last item we have inserted 0(1)
    public T pop() {
        if(isEmpty())
            return null;

        T item = stack[--count];

        // obsolete references - avoid memory leaks
        stack[count] = null;

        // maybe e have to resize the array and decrease the size
        // the stack is 25% full
        if(count > 0 && count == stack.length / 4) {
            resize(stack.length / 2);
        }

        return item;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    // size method in 0(1)
    public int size() {
        return count;
    }

    // this is the bottleneck of the application 0(N)
    private void resize(int capacity) {
        System.out.println("Need to resize the array");
        T[] stackCopy = (T[]) new Object[capacity];
        // copy the items one by one
        for (int i = 0; i < count; i++) {
            stackCopy[i] = stack[i];
        }
        // update the references
        stack = stackCopy;
    }
}
