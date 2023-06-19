package zajavka.week_04.summary.zoo;

public class Animal {
    Integer cellsNumber = 1024;
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void breathe() {
        System.out.println("breathe: " + this.name);
    }
}

