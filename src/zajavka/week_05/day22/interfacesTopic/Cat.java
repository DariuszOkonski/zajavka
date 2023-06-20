package zajavka.week_05.day22.interfacesTopic;

public class Cat implements CatStrokeable, Voiceable {

    @Override
    public void doSomethingAsStrokeableCat() {
        System.out.println("I like being stroked!");
    }

    @Override
    public void beStroked() {
        System.out.println("I am storked and it is really nice man!");
    }

    @Override
    public String gimmeVoice() {
        return "I'm giving You my voice";
    }

    @Override
    public void sing(String songName) {
        System.out.println("I'm singing the song: " + songName);
    }
}

