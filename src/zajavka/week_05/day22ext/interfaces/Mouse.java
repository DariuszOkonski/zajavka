package zajavka.week_05.day22ext.interfaces;

public class Mouse implements Animal {
    @Override
    public void run() {
        System.out.println("Mouse: I'm running");
    }

    @Override
    public void fly() {
        System.out.println("Mouse: I would like to fly");
    }

    @Override
    public void swim() {
        System.out.println("Mouse: I'm swimming");
    }
}
