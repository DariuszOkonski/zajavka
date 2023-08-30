package zajavka2.warsztat_01.ex2;

public interface Packable<T> {
    void pack(T element);
    T empty();
}

