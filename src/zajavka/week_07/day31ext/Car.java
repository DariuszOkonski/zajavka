package zajavka.week_07.day31ext;

public class Car extends Vehicle {

    @Override
    public void drive() throws Exception  {
        System.out.println("Driving.");
        throw new Exception();
    }

    public void reverse() {

    }
}
