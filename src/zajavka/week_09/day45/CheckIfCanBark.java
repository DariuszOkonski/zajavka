package zajavka.week_09.day45;

public class CheckIfCanBark implements Chackable{

    @Override
    public boolean test(Animal a) {
        return a.isCanBark();
    }

    @Override
    public String toString() {
        return "CanBark";
    }
}

