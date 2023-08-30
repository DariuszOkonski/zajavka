package SOLID.section_07_DependencyInversion.ex1;

public class App {
    public static void main(String[] args) {
        DatabaseController controller = new DatabaseController(new MySQLDatabase());
        controller.connect();
        controller.disconnect();
    }
}

