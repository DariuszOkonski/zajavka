package zajavka.week_05.day22ext.interfaces;

public class Ostrich implements Animal {

    public void hike() {
        System.out.println("I'm hiking");
    }

    @Override
    public void run() {
        System.out.println("Ostrich: I'm running");
    }

    @Override
    public void swim() {
        System.out.println("Ostrich: I'm swimming");
    }

    @Override
    public void fly() {
        System.out.println("Ostrich: I'm flying");
    }
}

