package zajavka2.warsztat_02.day_01;

public class CheckableImpl implements Checkable{
    @Override
    public boolean myTester(String value) {
        System.out.println("CheckableImpl calling");
        return value.contains("zajavka");
    }
}
