package zajavka.week_05.day21.abstractClass;

public abstract class Animal {
    private String color;

    public Animal(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract String gimmeVoice();


}
