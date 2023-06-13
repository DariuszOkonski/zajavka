package zajavka.week_04.day19;

public class Labrador extends Dog {
    public Labrador() {
        super();
        System.out.println("Labrador created");
    }

    public Labrador(int i) {
        this(String.valueOf(i));
        System.out.println("Labrador created with int");
    }

    public Labrador(String a) {
        this();
        System.out.println("Labrador created with String");
    }
}
