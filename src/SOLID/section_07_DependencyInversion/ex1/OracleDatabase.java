package SOLID.section_07_DependencyInversion.ex1;

public class OracleDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to a Oracle database...");;
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting the Oracle database...");
    }
}
