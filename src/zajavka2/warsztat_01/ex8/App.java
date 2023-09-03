package zajavka2.warsztat_01.ex8;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Tuna<String> tuna = new Tuna<>();
        tuna.eat("trash");

        Tuna<?> newTuna = tuna;
        System.out.println(newTuna.getName());
    }

    static class Tuna<U> {
        private U element;

        public void eat(U element) {
            this.element = element;
        }

        String getName() {
            return "Roman";
        }
    }
}
