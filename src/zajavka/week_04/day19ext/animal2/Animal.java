package zajavka.week_04.day19ext.animal2;

public class Animal {
    protected String name;
    private boolean hasLegs = false;

    public Animal() {
        this.hasLegs = true;
        this.name = "Burek";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", hasLegs=" + hasLegs +
                '}';
    }
}
