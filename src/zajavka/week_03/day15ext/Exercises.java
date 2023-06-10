package zajavka.week_03.day15ext;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
    }

    private static void ex8() {
        /*
        * Napisz program, który w tablicy znajdzie pary, których suma wynosi podaną przez Ciebie
        * wartość
        * */
    }

    private static void ex7() {
        /*
        * Napisz program, który znajdzie druga największą wartość w tablicy
        * */
    }

    private static void ex6() {
        /* Zamień wszystkie słowa w tablicy tak, aby zaczynały się wielką literą, natomiast reszta danego słowa
        była z małych literek. Postaraj się nie tworzyć żadnych nowych tablic oprócz tej, która zawiera dane
        wejścowe.
        * */
    }

    private static void ex5() {
        // Napisz program, który porówna ze sobą zawartość dwóch tablic i wydrukuje na ekranie, czy
        // zawartość jest taka sama. Kolejność wejściowa elementów nie ma znaczenia. Liczy się tylko
        // zawartość, np. [2,6,1,12]==[12,6,1,2] ale [2,6,1,12]!=[12,6,1,3]
    }
    private static void ex4() {
        // Napisz program który znajdzie w tablicy zduplikowane elementy i stworzy z nich tablicę.
        // Kolejność nie ma znaczenia
    }

    private static void ex3() {
        int[] intArray = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(intArray));
        intArray = arrayReverse(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    public static void ex2() {
        String str1 = "kajak";
        String str2 = "adidas";
        boolean isPalindrome = isPalindrome(str2);

        if(isPalindrome) {
            System.out.println(str2 + " is palindrome");
        } else {
            System.out.println(str2 + " is not palindrome");
        }

    }

    public static void ex1() {
        String str1 = "Some String";
        System.out.println(str1);
        str1 = stringReverse(str1);
        System.out.println(str1);
    }

    public static int[] arrayReverse(int[] array) {
        int[] localArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0 ; i--, j++) {
            localArray[j] = array[i];
        }

        return localArray;
    }
    public static boolean isPalindrome(String str) {
        char[] charArray = str.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if(charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String stringReverse(String str) {
        char[] localCharArray = new char[str.length()];

        int counter = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            localCharArray[counter] = str.charAt(i);
            counter++;
        }
        return new String(localCharArray);
    }
}
