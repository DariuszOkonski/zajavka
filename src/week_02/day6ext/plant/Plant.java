package week_02.day6ext.plant;

public class Plant {
    public String color = "green";

    public void rise() {
        System.out.println("I'm rising!!!");
    }

    public static void welcome() {
        System.out.println("Welcome");
    }

    @Override
    public String toString() {
        return "Plant{" +
                "color='" + color + '\'' +
                '}';
    }
}
