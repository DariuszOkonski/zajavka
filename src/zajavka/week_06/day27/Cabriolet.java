package zajavka.week_06.day27;

public class Cabriolet extends Car {
    private boolean roofOpened;

    public Cabriolet(final String company, final String model, final String color, final boolean roofOpened, final String... additionalEquipment) {
        super(company, model, color, additionalEquipment);
        this.roofOpened = roofOpened;
    }

    @Override
    protected String openDoors() {
        return "Cabrio opening doors";
    }

    @Override
    protected String openTrunk() {
        return "Cabrio opening trunk";
    }

    @Override
    public String horn() {
        return "Cabrio making sound";
    }

    public void openRoof() {
        if(!roofOpened) {
            System.out.println("Cabrio opening the rof");
            this.roofOpened = true;
        }
    }

    public void closeRoof() {
        if(roofOpened) {
            System.out.println("Cabrio closing the roof");
            this.roofOpened = false;
        }
    }
}
