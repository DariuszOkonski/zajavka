package algorithms_01._02_ArraysQuestions.ex2;

import java.util.Arrays;

public class AnagramProblem {
    public boolean solve(char[] s1, char[] s2) {
        if(s1.length != s2.length)
            return false;

        // sort the letters of the strings
        // 0(NlogN) this is the "bottleneck" of the algorithm
        Arrays.sort(s1);
        Arrays.sort(s2);

        // 0(N) but the overall running time is O(NlogN) + O(N) = O(NlogN)
        for (int i = 0; i < s1.length; i++) {
            if(s1[i] != s2[i])
                return false;
        }

        return true;
    }
}
