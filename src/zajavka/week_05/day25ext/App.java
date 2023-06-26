package zajavka.week_05.day25ext;

public class App {
    public static void main(String[] args) {
        Bag bag = new Bag(3);
        Kangaroo kangaroo = new Kangaroo(bag, "Kinga", 10);
        System.out.println(kangaroo);
        var bag1 = kangaroo.getBag();
        System.out.println(kangaroo);
    }
}

