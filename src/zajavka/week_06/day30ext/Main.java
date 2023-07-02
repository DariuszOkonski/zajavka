package zajavka.week_06.day30ext;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        System.out.println("After 1st parrot");
        Parrot parrot2 = new Parrot();

        System.out.println("Before static");
        System.out.println(Parrot.name);
    }
}
