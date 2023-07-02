package zajavka.week_06.day29ext;

import static zajavka.week_06.day29ext.Dog.NAME;
import static zajavka.week_06.day29ext.Dog.SURNAME;
import static zajavka.week_06.day29ext.Dog.AGE;
import static zajavka.week_06.day29ext.Dog.goForAWalkOnYourOwn;
import static zajavka.week_06.day29ext.Dog.bark;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(NAME);
        System.out.println(SURNAME);
        System.out.println(AGE);

        goForAWalkOnYourOwn();
        bark();
    }
}

