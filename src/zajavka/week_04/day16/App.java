package zajavka.week_04.day16;

public class App {
    public static void main(String[] args) {
        Concatenator example1 = new Concatenator();
        Concatenator example2 = new Concatenator();
        Concatenator example3 = new Concatenator();
        Concatenator example4 = example3;

        System.out.println(example1 == example2);
        System.out.println(example3 == example4);
    }
}

