package zajavka2.warsztat_02.day_08;

public class Ship {
    private final String model;

    public Ship() {
        this.model = "No model";
    }

    public Ship(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int gimmeModel(Ship ship) {
        return 1;
    }

}
