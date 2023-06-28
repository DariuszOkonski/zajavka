package zajavka.week_06.day26ext;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        for (Voicable voicable : Animal.values()) {
            System.out.println(voicable.makeVoice());
        }
    }
}
