package zajavka2.warsztat_02.ex_02;

public class Main {
    public static void main(String[] args) {
        TriCustomFunction<Dog> triCustomFunctionImpl = (s, i, dog) -> {
            return s.length() + i + dog.toString().length();
        };
        Integer resultSum = triCustomFunctionImpl.calculate("Zajavka", 2000, new Dog("Fafik", "Gryz"));
        System.out.println(resultSum);
        System.out.println("===");

        TriCustomFunction<Dog> triCustomFunctionImpl2 = Main::getResult;

        Integer resultSum2 = triCustomFunctionImpl2.calculate("Zajavka", 0, new Dog("Fafik", "Gryz"));
        System.out.println(resultSum2);

    }

    private static Integer getResult(String s, Integer i, Dog dog) {
        Integer sum = 0;
        sum += countChars(s, 'a');
        sum += i;
        sum += countChars(dog.toString(), ',') + countChars(dog.toString(), '=');
        return sum;
    }

    private static Integer countChars(String s, char c) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                sum++;
            }
        }
        return sum;
    }

    private static class Dog {
        private final String name;
        private final String surname;

        public Dog(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }
}