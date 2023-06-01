package zajavka.week_02.day9ext;

public class Main {
    public static void main(String[] args) {
        var a = 10;

        var main = new Main();
        main.printNumber(a);

        var result = main.add(3,4);
    }

    public void printNumber(int number) {
        System.out.println(number);
    }

    public int add(int first, int second) {
        return first + second;
    }
}
