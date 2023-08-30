package zajavka2.warsztat_01.ex2;

public class PackableBag implements Packable<Car>{

    @Override
    public void pack(Car element) {

    }

    @Override
    public Car empty() {
        return null;
    }
}

