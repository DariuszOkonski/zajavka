package zajavka2.warsztat_02.day_07;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        String someDog = Optional.of(new Dog("Burek"))
                .map(Dog::getName)
                .orElse("anotherDog");

        System.out.println(someDog);
    }
}

