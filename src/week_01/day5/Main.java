package week_01.day5;

import week_01.day5.animal.Dog;
import week_01.day5.animal.Spider;

public class Main {
    public static void main(String... args) {
        // TODO you have to do something here
        String hellodude = "Hello World";
        // FIXME please fix me someday
        System.out.println(hellodude);

        Dog dog = new Dog();
        Dog.getNumberOfLegs();

        Spider.getNumberOfLegs();
        Spider spider = new Spider();
    }
}