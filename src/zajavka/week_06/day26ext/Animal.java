package zajavka.week_06.day26ext;

public enum Animal implements Voicable{
    REINDEER("How how"),
    SHARK("Shhhhr"),
    CROCODILE("Cwap"),
    FROG("Ryrybr"),
    GIRAFFE("<eating_leaves>");

    private final String message;

    Animal(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String makeVoice() {
        return this + " - " + this.message;
    }
}
