package zajavka.week_07.day34ext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new Ship();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

