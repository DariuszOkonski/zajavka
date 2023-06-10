package zajavka.week_03.day15;

public class VarArgs {
    public static void main(String[] args) {
        varArgs1(new int[]{1,2,3,4,5,6,7});
    }

    private static void varArgs1(int... args) {
        for (int arg : args) {
            System.out.println(arg);
        }
    }
}
