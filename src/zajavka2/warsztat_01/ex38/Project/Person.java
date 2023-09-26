package zajavka2.warsztat_01.ex38.Project;

public class Person {
    private final String name;
    private final String surname;
    private final Integer counter;
    private final String id;

    public Person(String name, String surname, Integer counter) {
        this.name = name;
        this.surname = surname;
        this.counter = counter;
        this.id = generateId();
    }

    private String generateId() {
        return this.name + "_" + this.surname + "_" + this.counter;
    }
}
