package algorithms_01._06_Queues.ex4;

import java.util.Stack;

public class MaxItemStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;

    public MaxItemStack() {
        this.mainStack = new Stack<>();
        this.maxStack = new Stack<>();
    }

    public void push(int item) {
        mainStack.push(item);

        if(mainStack.size() == 1) {
            maxStack.push(item);
            return;
        }

        if(item > maxStack.peek()) {
            maxStack.push(item);
        } else {
            maxStack.push(maxStack.peek());
        }
    }

    public int pop() {
        maxStack.pop();
        return maxStack.pop();
    }

    public int getMaxItem() {
        return maxStack.peek();
    }

    @Override
    public String toString() {
        return "MaxItemStack{" +
                "mainStack=" + mainStack +
                ", maxStack=" + maxStack +
                '}';
    }
}
