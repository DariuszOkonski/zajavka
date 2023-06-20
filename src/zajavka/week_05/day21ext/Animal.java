package zajavka.week_05.day21ext;

import java.util.Objects;

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
        if ("Reksio".equals(name)) {
            return;
        }
        this.name = name;
    }

    private void welcome() {
        System.out.println("Welcome");
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
        return "Animal{" + "name='" + name + '\'' + ", age='" + age + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (!Objects.equals(name, animal.name)) return false;
        return Objects.equals(age, animal.age);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
