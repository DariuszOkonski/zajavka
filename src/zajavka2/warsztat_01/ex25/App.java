package zajavka2.warsztat_01.ex25;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Set<Duck> stringSet = new TreeSet<>();
        Duck donald1 = new Duck("Donald");
        Duck daisy = new Duck("Daisy");
        Duck donald2 = new Duck("Donald");

        stringSet.add(donald1);
        stringSet.add(daisy);
        stringSet.add(donald2);

        System.out.println(stringSet);
    }

    public static class Duck implements Comparable<Duck> {
        private String surname;

        public Duck(String surname) {
            this.surname = surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Duck duck = (Duck) o;
            return Objects.equals(surname, duck.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(surname);
        }

        @Override
        public String toString() {
            return "Duck{" +
                    "surname='" + surname + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Duck o) {
            return this.surname.compareTo(o.surname);
        }
    }
}
