package zajavka2.warsztat_02.day_23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(8);

        Stream<Integer> stream = integerList.stream();
                stream.reduce(0, (currentState, nextValue) -> currentState + nextValue);
                stream.reduce(0, (currentState, nextValue) -> currentState + nextValue);

    }
}
