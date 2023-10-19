package zajavka2.warsztat_02.day_18;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<String> stringStream = Stream.of("1", "7", "10")
                .peek(elem -> System.out.println("elem: " + elem));

        List<String> stringList = List.of("1", "7", "10", "12", "17", "20");
        Stream<String> stream1 = stringList.stream()
                .peek(elem -> System.out.println("elem 1: " + elem));
        Stream<String> stream2 = stringList.stream()
                        .peek(elem-> System.out.println("elem 2: " + elem));

        stream1.collect(Collectors.toList());
        stream2.collect(Collectors.toList());


    }
}
