package algorithms_01._02_ArraysQuestions.ex2;

import java.util.Arrays;

public class MyAnswer {
    public static void main(String[] args) {
        boolean result1 = solution("Adam".toCharArray(), "Daniel".toCharArray());
        boolean result2 = solution("restful".toCharArray(), "fluster".toCharArray());
        boolean result3 = solution("apple".toCharArray(), "orange".toCharArray());
        boolean result4 = solution("adidas".toCharArray(), "sadida".toCharArray());

        System.out.println("result 1: " + result1);
        System.out.println("result 2: " + result2);
        System.out.println("result 3: " + result3);
        System.out.println("result 4: " + result4);
    }

    public static boolean solution(char[] s1, char[] s2) {
        if(s1.length != s2.length)
            return false;

        Arrays.sort(s1);
        Arrays.sort(s2);

        System.out.println(s1);
        System.out.println(s2);

        for (int i = 0; i < s1.length; i++) {
            if(s1[i] != s2[i])
                return false;
        }

        return true;
    }
}
