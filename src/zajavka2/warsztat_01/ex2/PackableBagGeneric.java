package zajavka2.warsztat_01.ex2;

public class PackableBagGeneric<T> implements Packable<T>{
//    private static T arr;

    @Override
    public void pack(T element) {

    }

    @Override
    public T empty() {
        return null;
    }
}
