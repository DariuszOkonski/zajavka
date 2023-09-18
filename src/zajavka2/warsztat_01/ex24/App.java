package zajavka2.warsztat_01.ex24;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,4,1,5,1,2,5,2,5,2,1,5,2,1,14,52,15,25,12,52,81,81);
        Set<Integer> hashSet = new HashSet<>(integerList);
        Set<Integer> treeSet = new TreeSet<>(integerList);

//        System.out.println("treeset");
//        for (Integer tree : treeSet) {
//            System.out.print(tree + ", ");
//        }
//        System.out.println("===");
//        for (Integer hash : hashSet) {
//            System.out.print(hash + ", ");
//        }

        Set<Dog> dogs = new TreeSet<>((o1, o2) -> o2.name.compareTo(o1.name));
        dogs.add(new Dog("Romek"));
        dogs.add(new Dog("Romek"));
        dogs.add(new Dog("Stefan"));
        dogs.add(new Dog("Romek"));
        dogs.add(new Dog("Adam"));
        dogs.add(new Dog("Romek"));
        System.out.println(Collections.unmodifiableSet(dogs));

    }

    private static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
