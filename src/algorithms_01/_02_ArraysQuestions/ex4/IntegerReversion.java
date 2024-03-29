package algorithms_01._02_ArraysQuestions.ex4;

public class IntegerReversion {
    public int reverse(int n) {
        int reversed = 0;
        int remainder = 0;

        while (n > 0) {
            remainder = n % 10;
            n = n / 10;
            reversed = reversed * 10 + remainder;
        }

        return reversed;
    }
}
