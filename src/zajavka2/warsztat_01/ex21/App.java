package zajavka2.warsztat_01.ex21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> pantsList = new LinkedList<>(Arrays.asList("boxers", "normal pants"));
        pantsList.add("strings");
        System.out.println(pantsList);
    }
}
