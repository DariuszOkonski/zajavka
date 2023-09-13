package DesignPatterns.section_11_FactoryPattern.ex1;

public class App {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.CAT);
        animal.eat();

        animal = AnimalFactory.getAnimal(AnimalType.DOG);
        animal.eat();

        animal = AnimalFactory.getAnimal(AnimalType.LION);
        animal.eat();

        animal = AnimalFactory.getAnimal(AnimalType.TIGER);
        animal.eat();
    }
}

