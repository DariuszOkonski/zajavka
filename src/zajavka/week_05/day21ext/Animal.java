package zajavka.week_05.day21ext;

public abstract class Animal {
    private String name;
    private String age;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if("Reksio".equals(name)) {
            return;
        }
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Animal withName(String name) {
        this.name = name;
        return this;
    }

    public Animal withAge(String age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
