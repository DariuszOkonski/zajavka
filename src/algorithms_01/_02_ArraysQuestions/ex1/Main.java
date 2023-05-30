package algorithms_01._02_ArraysQuestions.ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));

        ReverseArrayProblem problem = new ReverseArrayProblem();
        nums = problem.solve(nums);

        System.out.println(Arrays.toString(nums));
    }
}
