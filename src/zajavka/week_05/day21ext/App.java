package zajavka.week_05.day21ext;

public class App {
    public static void main(String[] args) {
        Animal animal = new Persian("Antek");
        animal.withName("Romek").withAge("16");

        System.out.println(animal);

        String sth = "someString";
        String result = sth.substring(1).toLowerCase().trim();
    }
}

