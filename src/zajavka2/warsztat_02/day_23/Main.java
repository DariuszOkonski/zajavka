package zajavka2.warsztat_02.day_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(8);

        Optional<Integer> first = integerList.stream().findFirst();
        System.out.println(first);
    }
}
