package java_A_Z.section06.ex4;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String str1 = "   Hello world in Java!  ";

        System.out.println(str1.replace('l', 'K'));
        System.out.println(str1.replaceAll("Java", "Python"));
        System.out.println(str1.trim());

        String str = "this&is&going&to&be&splitted";
        String[] strings = str.split("&", 6);

        for (String s :
                strings) {
            System.out.println(s);
        }

    }
}
