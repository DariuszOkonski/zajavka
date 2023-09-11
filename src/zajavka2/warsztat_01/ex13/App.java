package zajavka2.warsztat_01.ex13;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "A", "1", "aA", "Aa", "A1", "a1");
        System.out.println(strings);

//        Comparator<String> naturalOrder = Comparator.naturalOrder();
//        Comparator<String> comparator = naturalOrder.reversed();

        Comparator<String> comparator = Comparator.<String>naturalOrder().reversed();

        strings.sort(comparator);
        System.out.println(strings);
        System.out.println("=================");

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1, "Roman"));
        cats.add(new Cat(6, "Zbyszek"));
        cats.add(new Cat(3, "Rafał"));
        cats.add(new Cat(2, "Stefan"));
        cats.add(new Cat(5, "Roman"));
        cats.add(new Cat(4, "Roman"));
//        cats.add(null);

        Comparator<Cat> myFirstComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        myFirstComparator = myFirstComparator.thenComparing((o1, o2) -> o1.getId() - o2.getId());

        cats.sort(myFirstComparator);
        System.out.println(cats);
    }
}

