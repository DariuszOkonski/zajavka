package zajavka2.warsztat_01.ex37.zad2;

public class Person {
    private final String name;
    private final String surname;
    private final String phone;

    public Person(String input) {
        String[] splitInput = input.split(" ");
        if(splitInput.length == 3) {
            this.name = splitInput[0];
            this.surname = splitInput[1];
            this.phone = splitInput[2];
        } else {
            throw new RuntimeException("Wrong input: " + input);
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
