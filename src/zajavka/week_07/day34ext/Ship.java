package zajavka.week_07.day34ext;

import java.io.IOException;

public class Ship {
    private String name;

    {
        if(7 == 7) {
            throw new IOException();
        }

    }

    public Ship() throws IOException {
        System.out.println("here");
    }

    public Ship(String name) throws IOException {
        System.out.println("there");
        this.name = name;
    }
}
