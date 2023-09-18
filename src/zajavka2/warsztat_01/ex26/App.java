package zajavka2.warsztat_01.ex26;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        Map<Dog, String> dogStringMap = new HashMap<>();
        dogStringMap.put(new Dog("Romek"), "ma swój domek");
        dogStringMap.put(new Dog("Stefan"), "zajavka");
        dogStringMap.put(new Dog("Zbyszek"), "skjskljf");
        dogStringMap.put(new Dog("Stefan"), "ksjdflkjsfdl");

        System.out.println(dogStringMap);
    }

    public static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dog dog = (Dog) o;
            return Objects.equals(name, dog.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
