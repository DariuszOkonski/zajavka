package zajavka2.warsztat_01.ex37.zad2;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> inputPeopleList = List.of(
                "Jerzy Kowalski +48000192841",
                "Jan Kowalski +48000192871",
                "Zdzislaw Kowalski +48000192871",
                "Andrzej Kowalski +48000192871",
                "Stefan Nawrocki +48000125847",
                "Anna Tomaszewska +48000421458"
                );

        List<Person> peopleList = new ArrayList<>();

        for (String input : inputPeopleList) {
            peopleList.add(new Person(input));
        }

        Map<String, List<Person>> phoneBook = new TreeMap<>();

        for (Person person : peopleList) {
            addPersonToPhoneBook(phoneBook, person);
        }

        System.out.println("#####");
        for (Map.Entry<String, List<Person>> entry : phoneBook.entrySet()) {
            System.out.println(entry);
        }
    }

    private static void addPersonToPhoneBook(Map<String, List<Person>> phoneBook, Person person) {
        List<Person> bySurnameList =
                getSurnameList(phoneBook, person);

        bySurnameList.add(person);
        bySurnameList.sort(Comparator.comparing(person1 -> person1.getName()));
        phoneBook.put(person.getSurname(), bySurnameList);
    }

    private static List<Person> getSurnameList(Map<String, List<Person>> phoneBook, Person person) {
        return !phoneBook.containsKey(person.getSurname())
                ? new ArrayList<>()
                : phoneBook.get(person.getSurname());
    }
}

