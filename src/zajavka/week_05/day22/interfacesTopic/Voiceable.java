package zajavka.week_05.day22.interfacesTopic;

public interface Voiceable {
    String gimmeVoice();

    default void sing(String songName) {
        singMeASongWithName(songName);
    }

    private static void singMeASongWithName(String songName) {
        System.out.println("Default singing song method: " + songName);
    }
}
