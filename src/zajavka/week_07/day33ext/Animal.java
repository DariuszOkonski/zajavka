package zajavka.week_07.day33ext;

public abstract class Animal {
    private String name;

    public Animal(String name) throws InvalidAnimalNameException {
        if (name == null) {
            throw new InvalidAnimalNameException("Provided name is null.");
        }
        this.name = name;
        System.out.println("Name set to value: " + this.name);
    }
}

