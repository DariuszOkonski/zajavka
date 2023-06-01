package zajavka.week_02.day9ext;

public class Main {
    public static void main(String[] args) {
        String a = "wow";
        String b = new String("wow");
        b = b.intern();

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
