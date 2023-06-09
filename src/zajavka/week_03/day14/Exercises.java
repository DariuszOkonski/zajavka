package zajavka.week_03.day14;

public class Exercises {
    public static void main(String[] args) {

//        ex1factorial(17);
//        ex2palindrome("romet");
//        ex3printChristmasTree('#', 9);
//        ex4paintingExercise(100);
//        ex5firstNumber(30);
//        ex6someNumbers(10);
//        ex7fibonacci(10);
//        ex8treeNumbers(999, 4);
    }

    private static void ex8treeNumbers(int limit, int trees) {
        for (int i = 1; i <= limit ; i++) {
            if(i % 111 == 0) {
                System.out.println(i);
                for (int j = 0; j < trees; j++) {
                    for (int k = 0; k < trees; k++) {
                        System.out.print('#');
                    }
                    System.out.println();
                }
            }
        }
    }

    private static void ex7fibonacci(int number) {
        int previous = 1;
        int current = 1;
        int result = 1;
        System.out.println(previous);

        for (int j = 1; j < number; j++) {
            System.out.println(result);
            result = previous + current;
            previous = current;
            current = result;

        }
    }

    private static void ex6someNumbers(int limit) {
        int firstCounter = 39;
        int secondCounter = 11;

        System.out.print("[");
        for (int j = 0; j < limit; j++) {
            if (j == limit - 1) {
                System.out.print(firstCounter + ", " + secondCounter);
            } else {
                System.out.print(firstCounter + ", " + secondCounter + ", ");
            }
            firstCounter +=2;
            secondCounter -= 3;

        }
        System.out.print("]");
    }

    private static void ex5firstNumber(int number) {
        if (number < 2)
            return;

        for (int i = 2; i < number; i++) {
            if(number % i == 0) {
                System.out.println(i + ": is not first number");
                continue;
            }
            System.out.println(i + ": is first number");
        }
    }

    private static void ex4paintingExercise(int number) {
        String[] colors = {"red", "green", "blue", "black", "yellow", "brown"};

        int counter = 0;
        for (int i = 1; i <= number; i++) {
            System.out.println(i + ": " + colors[counter]);
            counter++;
            if(counter == colors.length) {
                counter = 0;
            }
        }

    }

    private static void ex3printChristmasTree(char sign, int baseSize) {
        for (int i = baseSize / 2; i >= 0; i--) {
            for (int j = baseSize ; j >= 0; j--) {
                char element = 'x';
                if(j <= i || j > baseSize - i) {
                    element = ' ';
                }
                System.out.print(element);
            }
            System.out.println();
        }
    }

    private static void ex2palindrome(String world) {
        boolean result = true;
        for (int i = 0, j = world.length() - 1; i < j; i++, j--) {
            if(world.charAt(i) != world.charAt(j)) {
                result = false;
                break;
            }
        }

        if(result) {
            System.out.println("'" + world + "' is palindrome");
        } else {
            System.out.println("'" + world + "' is not palindrome");
        }
    }

    private static void ex1factorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
            System.out.println(i + "!: " + factorial);
        }
    }
}
