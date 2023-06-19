package zajavka.week_04.summary.zoo;

import zajavka.week_04.summary.zoo.Animal;

public class Mammal extends Animal {
    int milkProduction = 685;

    public Mammal(String name, int milkProduction) {
        super(name);
        this.milkProduction = milkProduction;
    }

    void feedWithMilk() {
        System.out.println(this.milkProduction / this.cellsNumber);
    }
}
