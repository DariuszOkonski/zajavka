package zajavka2.warsztat_01.ex6_summary;

public class Sock<T> {
    private T item;

    public boolean put(T element) {
        if(item == null || !this.item.equals(element)) {
            this.item = element;
            return true;
        }
        return false;
    }

    public T getItem() {
        return item;
    }
}
