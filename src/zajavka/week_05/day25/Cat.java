package zajavka.week_05.day25;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize Cat called");
    }
}
