package zajavka.week_05.day21.abstractClass;

public class Labrador extends Dog {
    public Labrador(String name, String color) {
        super(name, color);
    }

    @Override
    String gimmeVoice() {
        return "Labrador woof woof!";
    }
}
