package algorithms_01._03_LinkedLists;

public class App {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.insert("Adam");
        names.insert("Daniel");
        names.insert("Ana");

        names.travers();
        System.out.println("===");
        names.remove("Ana");
        names.travers();
        System.out.println("==============================");

        LinkedList<Person> people = new LinkedList<>();

        Person p = new Person(23, "Adam");
        people.insert(p);
        people.insert(new Person(34, "Daniel"));
        people.insert(new Person(56, "Michael"));

        people.travers();
        System.out.println("---");
        people.remove(p);
        people.travers();
    }
}
