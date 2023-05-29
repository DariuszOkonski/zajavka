package week_02.day6ext.plant;

public class Plant {
    private String color;
    private int numberOfLeaves;

    public Plant(String color, int numberOfLeaves) {
        this.color = color;
        this.numberOfLeaves = numberOfLeaves;
    }

    public String getColor() {
        return color;
    }

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
                ", numberOfLeaves=" + numberOfLeaves +
                '}';
    }
}
