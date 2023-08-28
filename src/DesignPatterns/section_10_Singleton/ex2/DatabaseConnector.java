package DesignPatterns.section_10_Singleton.ex2;

public class DatabaseConnector {
    // lazy version
    private static DatabaseConnector INSTANCE = new DatabaseConnector();
    // we are not able to instantiate the class
    // new instance can be created with "reflection attack"
    private DatabaseConnector() {
    }
    public static DatabaseConnector getInstance() {
        // we just instantiate the class if necessary
        if(INSTANCE == null) {
            // this block can be entered by a single thread
            // problem: it is too slow (100x)
            synchronized (DatabaseConnector.class) {
                INSTANCE = new DatabaseConnector();
            }
        }
        return INSTANCE;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting...");
    }
}
