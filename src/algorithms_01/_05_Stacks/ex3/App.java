package algorithms_01._05_Stacks.ex3;

import java.util.Collections;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // push() - 0(1)
        stack.push("Adam");
        stack.push("Bill");
        stack.push("Jeff");
        stack.push("Elon");

        // peek() runs in 0(1) and returns the last item we hve inserted
        System.out.println(stack.peek());
        System.out.println(Collections.unmodifiableList(stack));

        // pop() in 0(1) that is going to remove the last item ( + return the value)
        System.out.println(stack.pop());
        System.out.println(Collections.unmodifiableList(stack));

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
