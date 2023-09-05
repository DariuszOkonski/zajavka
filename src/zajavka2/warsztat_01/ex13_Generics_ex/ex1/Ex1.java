package zajavka2.warsztat_01.ex13_Generics_ex.ex1;

import java.util.List;

public class Ex1 {
    public static void main(String[] args) {

    }

    public static<T extends List<T>> int method(T[] arg1, T arg2) {

        return 0;
    }
}
