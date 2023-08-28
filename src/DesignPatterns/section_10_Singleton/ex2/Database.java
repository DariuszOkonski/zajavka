package DesignPatterns.section_10_Singleton.ex2;

public enum Database {
    // acquiring the INSTANCE is thread safe
    INSTANCE;

    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public void disconnect() {
        System.out.println("Disconnect to the database...");
    }
}
