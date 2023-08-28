package DesignPatterns.section_10_Singleton.ex1;

public class App {
    public static void main(String[] args) {
        DatabaseConnector object1 = DatabaseConnector.getInstance();
        DatabaseConnector object2 = DatabaseConnector.getInstance();

        System.out.println(object1 == object2);
        System.out.println(object1.equals(object2));
    }
}

