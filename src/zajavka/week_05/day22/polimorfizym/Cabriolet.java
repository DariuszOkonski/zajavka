package zajavka.week_05.day22.polimorfizym;

public class Cabriolet implements Car {
    private boolean roofOpened;

    public Cabriolet(final boolean roofOpened) {
        this.roofOpened = roofOpened;
    }

    public boolean isRoofOpened() {
        return roofOpened;
    }

    public void setRoofOpened(final boolean roofOpened) {
        this.roofOpened = roofOpened;
    }

    @Override
    public void describe() {
        System.out.println("Cabriolet description start");
        System.out.println("Cabriolet has opened roof: " + this.roofOpened);
        System.out.println("Cabriolet description end");
    }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "roofOpened=" + roofOpened +
                '}';
    }
}
