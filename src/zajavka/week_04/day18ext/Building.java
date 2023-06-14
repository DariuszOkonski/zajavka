package zajavka.week_04.day18ext;

class Building {
    public String address = "St. Paul II";
    public int number = 12;

    public void print() {
        System.out.println("I'm building");
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", number=" + number +
                '}';
    }
}

