package DesignPatterns.section_10_Singleton.ex2;

public class App {
    public static void main(String[] args) {
        Database object1 = Database.INSTANCE;
        Database object2 = Database.INSTANCE;

        System.out.println(object1 == object2);
        System.out.println(object1.equals(object2));
    }
}

