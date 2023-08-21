package algorithms_01._03_LinkedLists.ex1;

public class App {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.insert("Adam");
        names.insert("Daniel");
        names.insert("Michael");
        names.insert("Kevin");
        names.insert("Ana");

        System.out.println("middle item: " + names.getMiddleNode());

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

        System.out.println("==================================");
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.insert(10);
        myLinkedList.insert(2);
        myLinkedList.insert(13);
        myLinkedList.insert(5);
        myLinkedList.travers();
        System.out.println("===");
        myLinkedList.reverse();
        myLinkedList.travers();

    }
}
