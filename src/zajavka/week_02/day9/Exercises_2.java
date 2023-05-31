package zajavka.week_02.day9;

public class Exercises_2 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
    }

    public static void ex1(){
        System.out.println("EX - 1");
        String str1 = "Some String";
        int strLength = str1.length();
        System.out.println(String.format("str1 length: %s", strLength));
        System.out.println("---");
    }
    public static void ex2(){
        System.out.println("EX - 2");
        String str1 = "String1";
        String str2 = "String2";
        String str3 = "String3";
        String str4 = "String4";
        String str5 = "String5";

        System.out.println(str1 + str2 + str3 + str4 + str5);
        System.out.println(str1.concat(str2).concat(str3).concat(str4).concat(str5));
        System.out.println("---");
    }
    public static void ex3(){
        System.out.println("EX - 3");
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
        double number = 11.1;
        char charNumber = (char) number;
        String str1 = "Some very long string is here for you";

        for (char vowel: vowels) {
            str1 = str1.replace(vowel, charNumber);
        }

        System.out.println(str1);
        System.out.println("---");
    }
    public static void ex4(){
        System.out.println("EX - 4");
        String str1 = "This text is with Java name containing";
        String str2 = "This text is with Python name containing";
        String strToFind = "Java";

        System.out.println(str1.contains(strToFind));
        System.out.println(str2.contains(strToFind));


        System.out.println("---");
    }
    public static void ex5(){
        System.out.println("EX - 5");
        String str1 = "Java";
        String str2 = "jaVa";
        String str3 = "pYthon";

        System.out.println(str1.toLowerCase().equals(str2.toLowerCase()));
        System.out.println(str1.toLowerCase().equals(str3.toLowerCase()));


        System.out.println("---");
    }
    public static void ex6(){
        System.out.println("EX - 6");
        String str = "SomeStringLongerThan10Signs";

        if(str.length() <= 10) {
            System.out.println("String is to short");
            return;
        }

        System.out.println(str.substring(3, 8));

        System.out.println("---");
    }
}
