package zajavka2.warsztat_02.day_21;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("v1", "v2", "v3");

        System.out.println(stringList.stream().count());

        Optional<String> firstResult = stringList.stream().findFirst();
        System.out.println(firstResult);

        boolean v = stringList.stream()
                .allMatch(elem -> elem.contains("v"));
        System.out.println(v);
    }
}
