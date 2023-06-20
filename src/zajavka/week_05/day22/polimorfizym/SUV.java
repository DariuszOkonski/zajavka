package zajavka.week_05.day22.polimorfizym;

public class SUV implements Car {
    private double height;

    public SUV(final double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(final double height) {
        this.height = height;
    }

    @Override
    public void describe() {
        System.out.println("SUV description start");
        System.out.println("SUV height: " + this.height);
        System.out.println("SUV description end");
    }

    @Override
    public String toString() {
        return "SUV{" +
                "height=" + height +
                '}';
    }
}
