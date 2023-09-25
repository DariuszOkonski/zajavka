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
            List<Person> bySurnameList =
                    !phoneBook.containsKey(person.getSurname())
                    ? new ArrayList<>()
                    : phoneBook.get(person.getSurname());

            bySurnameList.add(person);
//            bySurnameList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
            bySurnameList.sort(Comparator.comparing(person1 -> person1.getName()));
            phoneBook.put(person.getSurname(), bySurnameList);
        }

        System.out.println("#####");
        for (Map.Entry<String, List<Person>> entry : phoneBook.entrySet()) {
            System.out.println(entry);
        }
    }
}

