package SOLID.section_07_DependencyInversion.ex1;

public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to a MySQL database...");;
    }
    @Override
    public void disconnect() {
        System.out.println("Disconnecting the MySQL database...");
    }
}

