package zajavka2.warsztat_02.ex_02;

public class Main {
    public static void main(String[] args) {
        TriCustomFunction<Dog> triCustomFunctionImpl = (s, i, dog) -> {
            return s.length() + i + dog.toString().length();
        };
        Integer resultSum = triCustomFunctionImpl.calculate("Zajavka", 2000, new Dog("Fafik"));
        System.out.println(resultSum);
        System.out.println("===");

        TriCustomFunction<Dog> triCustomFunctionImpl2 = (s, i, dog) -> {
            Integer sum = 0;
            sum += (s.split("a").length - 1);
            System.out.println(sum);
            return sum;
        };

        Integer resultSum2 = triCustomFunctionImpl2.calculate("Zajavka", 0, new Dog("Fafik"));
        System.out.println(resultSum2);

    }

    private static class Dog {
        private final String name;

        private Dog(String name) {
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