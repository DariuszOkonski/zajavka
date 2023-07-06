package zajavka.week_07.day34ext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
          Ship ship = new Ship("Shippek");
          throw new RuntimeException("My new exception");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally.");
        }

        System.out.println("After finally");
    }
}

