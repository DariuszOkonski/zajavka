package zajavka.week_09.day45;

public class CheckIfCanFly implements Chackable {
    @Override
    public boolean test(Animal a) {
        return a.isCanFly();
    }

    @Override
    public String toString() {
        return "CanFly";
    }
}
