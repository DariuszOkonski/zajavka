package zajavka2.warsztat_01.ex1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("2");
        list.add("element");
        list.add("new App()");

        print(list);
    }

    private static void print(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}

