package zajavka.week_05.day25ext;

public class Bag {
    private int size;

    public Bag(int size) {
        this.size = size;
    }

    public Bag(Bag bag) {
        this.size = bag.size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "size=" + size +
                '}';
    }
}
