package zajavka.week_05.day25ext;

public class App {
    public static void main(String[] args) {
        Kangaroo kangaroo = new Kangaroo("Kinga", 10);

        System.out.println(kangaroo);
        kangaroo = kangaroo.withName("Daria").withAge(3).withName("Grazyna");
        System.out.println(kangaroo);
    }
}

