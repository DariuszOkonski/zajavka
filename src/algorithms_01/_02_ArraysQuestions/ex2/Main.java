package algorithms_01._02_ArraysQuestions.ex2;

public class Main {
    public static void main(String[] args) {
        AnagramProblem problem = new AnagramProblem();
        System.out.println(problem.solve("Adam".toCharArray(), "Daniel".toCharArray()));
        System.out.println(problem.solve("restful".toCharArray(), "fluster".toCharArray()));
        System.out.println(problem.solve("apple".toCharArray(), "orange".toCharArray()));
    }
}
