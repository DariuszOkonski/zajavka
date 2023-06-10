package zajavka.week_04.day16;

import java.util.Arrays;

public class VariableVisibilityScope {
    private int a;
    private Integer b;

    public static void main(String[] args) {
        var example = new VariableVisibilityScope();
        example.method();
    }

    private void method() {
        System.out.println(a);
        System.out.println(b);
    }

    private void method2(String c) {
        System.out.println(a);
        System.out.println(c);
    }

    private void method3(String c, String... e) {
        System.out.println(a);
        System.out.println(c);
        System.out.println(Arrays.toString(e));
    }

    private void method3() {
//        String d;
//        System.out.println(d);
    }
}
