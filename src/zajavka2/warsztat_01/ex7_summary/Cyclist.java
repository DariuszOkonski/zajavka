package zajavka2.warsztat_01.ex7_summary;

public class Cyclist<T> implements Bikeable<T> {
    @Override
    public void ride(T bike) {
        System.out.println("I'm riding a bike from company: " + bike);
    }

    static <V> void method(V t) {
        System.out.println(t);
    }
}

