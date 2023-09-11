package zajavka2.warsztat_01.ex13;

public class Cat {
    private Integer id;
    private String name;

    public Cat(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat: " + id + ", " + name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
