package zajavka.week_06.day26ext;

public enum Animal implements Voicable{
    REINDEER("How how") {
        @Override
        public void sign() {
            System.out.println("Fuck off");
        }
    },
    SHARK("Shhhhr") {
        @Override
        public void sign() {
            System.out.println("Fuck off");
        }
    },
    CROCODILE("Cwap") {
        @Override
        public void sign() {
            System.out.println("Fuck off");
        }
    },
    FROG("Ryrybr") {
        @Override
        public void sign() {
            System.out.println("Fuck off");
        }
    },
    GIRAFFE("<eating_leaves>") {
        @Override
        public void sign() {
            System.out.println("Fuck off");
        }
    };

    private final String message;

    Animal(String message) {
        this.message = message;
    }

    public abstract void sign();
    public String getMessage() {
        return message;
    }

    @Override
    public String makeVoice() {
        return this + " - " + this.message;
    }
}
