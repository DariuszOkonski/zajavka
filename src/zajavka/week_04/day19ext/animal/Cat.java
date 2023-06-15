package zajavka.week_04.day19ext.animal;


import zajavka.week_04.day19ext.animal2.Animal;

public class Cat extends Animal {
    private String surname;

    public Cat() {
        this("Kowalski");
        System.out.println("Cat constructor");
    }
    public Cat(String surname) {
        this.surname = surname;
    }
}
