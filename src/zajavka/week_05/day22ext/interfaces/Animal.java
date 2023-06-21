package zajavka.week_05.day22ext.interfaces;

public interface Animal extends Swimmable, Flyable {
    String name = "Animal";
    void run();

    default void live() {
        System.out.println("Animal: I'm alive");
    }
}

