package java_A_Z.section07.ex1;

public class App {
    enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        Day monday = Day.MONDAY;

        for(Day d: Day.values()) {
            System.out.println(d);
        }
        System.out.println("====");

        for(Season s: Season.values()) {
            System.out.println(s);
        }

        System.out.println("=======");
        Season season = Season.AUTUMN;
        seasonMethod(season);
    }

    public static void seasonMethod(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("This is spring...");
                break;
            case AUTUMN:
                System.out.println("This is autumn...");
                break;
            case WINTER:
                System.out.println("This is winter...");
                break;
            case SUMMER:
                System.out.println("This si summer...");
                break;
            default:
                System.out.println("No such an option...");
                break;
        }
    }
}

