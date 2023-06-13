package zajavka.week_04.day18ext;

public class Building {
    public String address = "St. Paul II";
    public int number = 12;
    public Flat flat = new Flat();

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", number=" + number +
                ", flat=" + flat +
                '}';
    }
}

