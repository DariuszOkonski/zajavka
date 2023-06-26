package zajavka.week_05.day25ext;

public final class Kangaroo {
    private final String name;
    private final int age;

    public Kangaroo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Kangaroo withName(String name) {
        return new Kangaroo(name, this.age);
    }

    public Kangaroo withAge(int age) {
        return new Kangaroo(this.name, age);
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
