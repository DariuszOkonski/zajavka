package zajavka.week_04.day17ext;

public class Person {

    public void eat(Cucumber cucumber) {
        System.out.println("Eating cucumber 1");
    }

    public void eat(Cucumber... cucumber) {
        System.out.println("Eating cucumber 2");
    }



}
