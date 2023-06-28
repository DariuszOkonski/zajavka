package zajavka.week_06.day27;

public class App {
    public static void main(String[] args) {
        Cabriolet cabriolet = new Cabriolet("BMW", "8", "red", false,
                "fire extinguisher", "message");
        cabriolet.greetings();
        cabriolet.closeRoof();
        cabriolet.countAdditionalEquipmentElements();
        cabriolet.getAdditionalEquipment();
    }
}
