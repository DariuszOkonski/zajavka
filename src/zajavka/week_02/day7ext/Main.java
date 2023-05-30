package zajavka.week_02.day7ext;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = cat1;

        System.out.println(cat1.name);
        System.out.println(cat2.name);
        cat1.name = "Burek";
        System.out.println(cat1.name);
        System.out.println(cat2.name);

    }
}

