package zajavka2.warsztat_01.ex7_summary;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
//        Cyclist cyclist = new Cyclist();
//        cyclist.ride("Giant");

        Cyclist.method("Hello");
        Cyclist.method(2);

        Cyclist.<String>method("Dog");
        Cyclist.<Integer>method(4);
        Cyclist.<BigDecimal>method(new BigDecimal(22));
    }
}

