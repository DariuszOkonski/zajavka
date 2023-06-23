package zajavka.week_05.day25;

public class Cat {
    private String name;
    private String color;
    private String age;
    private String hoursOfSleeping;

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public Cat setColor(String color) {
        this.color = color;
        return this;
    }

    public Cat setAge(String age) {
        this.age = age;
        return this;
    }

    public Cat setHoursOfSleeping(String hoursOfSleeping) {
        this.hoursOfSleeping = hoursOfSleeping;
        return this;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize Cat called");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                ", hoursOfSleeping='" + hoursOfSleeping + '\'' +
                '}';
    }
}
