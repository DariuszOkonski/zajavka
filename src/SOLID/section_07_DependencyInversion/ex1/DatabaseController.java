package SOLID.section_07_DependencyInversion.ex1;

// the high level module
public class DatabaseController {
    private Database database;

    public DatabaseController(Database database) {
        this.database = database;
    }

    public void connect() {
        this.database.connect();
    }

    public void disconnect() {
        this.database.disconnect();
    }
}

