package zajavka.week_04.day18ext;

class House extends Building {
    public int noOfRooms = 3;
    public String name;
    public boolean hasWindows = true;

    @Override
    public String toString() {
        return "House{" +
                "noOfRooms=" + noOfRooms +
                ", name='" + name + '\'' +
                ", hasWindows=" + hasWindows +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }
}

