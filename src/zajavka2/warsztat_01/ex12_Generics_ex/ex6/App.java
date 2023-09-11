package zajavka2.warsztat_01.ex12_Generics_ex.ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Stack<ItemOnTable> stack = new Stack<>();

        stack.put(new Book());
        stack.put(new Book());
        stack.put(new Smartphone());
        stack.put(new Newspaper());

        System.out.println(stack);
        System.out.println(stack.take().orElse(null ));
        System.out.println(stack);
    }

    public static class Stack<T extends ItemOnTable> {
        private List<T> stack = new ArrayList<>();

        public void put(T element) {
            if(element == null) {
                return;
            }
            this.stack.add(element);
        }

        public Optional<T> take() {
            if(this.stack.size() == 0) {

                return Optional.empty();
            }
            return Optional.ofNullable(this.stack.remove(this.stack.size() - 1));
        }

        @Override
        public String toString() {
            return stack.toString();
        }
    }

    public static class Book implements ItemOnTable {
        @Override
        public String toString() {
            return "Book{}";
        }
    }

    public static class Smartphone implements ItemOnTable {
        @Override
        public String toString() {
            return "Smartphone{}";
        }
    }
    public static class Newspaper implements ItemOnTable {
        @Override
        public String toString() {
            return "Newspaper{}";
        }
    }
    interface ItemOnTable {}


}
