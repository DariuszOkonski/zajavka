package zajavka2.warsztat_01.ex13_Generics_ex.ex4;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Cat[] catsArray = new Cat[] {new Cat("Mirek"), new Cat("Marek"), new Cat("Murek")};
        System.out.println(Arrays.toString(catsArray));

        System.out.println(exerciseFour(catsArray, -1, 3));
        System.out.println(exerciseFour(catsArray,1,2));

        System.out.println(Arrays.toString(catsArray));
    }

    public static<T extends Animal> boolean exerciseFour(T[] array, int indexStar, int indexEnd) {
        if(indexStar == indexEnd
                || indexStar < 0
                || indexEnd < 0
                || indexStar >= array.length
                || indexEnd >= array.length
        ) {
            return false;
        }

        T temp = array[indexStar];
        array[indexStar] = array[indexEnd];
        array[indexEnd] = temp;

        return true;
    }

    public static class Cat extends Animal{
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static class Animal {}


}
