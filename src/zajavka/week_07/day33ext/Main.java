package zajavka.week_07.day33ext;

public class Main {
    public static void main(String[] args) {
        try {
            Animal animal1 = new Rat(null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            Animal animal = new Rat("Zbyszek");
        } catch (InvalidAnimalNameException e) {
            throw new RuntimeException(e);
        }
    }
}

