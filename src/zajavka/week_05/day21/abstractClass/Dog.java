package zajavka.week_05.day21.abstractClass;

public abstract class Dog extends Animal {
    private String name;
    public Dog(final String name, String color) {
        super(color);
        this.name = name;
    }

}
