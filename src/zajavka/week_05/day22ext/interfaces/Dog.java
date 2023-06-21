package zajavka.week_05.day22ext.interfaces;

public class Dog implements Animal {
    @Override
    public void run() {
        System.out.println("Dog: I'm running");
    }

    @Override
    public void fly() {
        System.out.println("Dog: I'm sad because can't fly");
    }

    @Override
    public void swim() {
        System.out.println("Dog: I'm swimming");
    }
}
