package zajavka2.warsztat_01.ex1;

public class Bag<T> {
    private T element;

    public void pack(T element) {
        this.element = element;
    }

    public T empty() {
        T element = this.element;
        this.element = null;
        return element;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "element=" + element +
                '}';
    }
}

