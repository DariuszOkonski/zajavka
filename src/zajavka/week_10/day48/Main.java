package zajavka.week_10.day48;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> op1 = Optional.empty();
        Optional<String> op2 = Optional.ofNullable(null);


        System.out.println(op1);
        System.out.println(op2);
        // 19.00
    }
}
