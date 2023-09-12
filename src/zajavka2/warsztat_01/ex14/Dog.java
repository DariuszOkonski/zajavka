package zajavka2.warsztat_01.ex14;

public class Dog implements Comparable<Dog> {
    private final Integer id;
    private final String name;

    public Dog(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog: " + name + "-id: " + id;
    }

    @Override
    public int compareTo(Dog o) {
        int result = this.name.compareTo(o.name);
        if(result != 0) {
            return result;
        }

        return this.id - o.id;
    }
}
