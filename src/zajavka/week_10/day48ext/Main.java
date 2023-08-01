package zajavka.week_10.day48ext;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Optional<Human> human = retrieveHuman("Adama");

        Optional<String> filteredNameOpt = human.map(h -> h.getName()).filter(n -> n.length() > 4);
        System.out.println(filteredNameOpt);
        filteredNameOpt.ifPresent(n -> System.out.println(n));


    }
    public static Optional<Human> retrieveHuman(final String name) {
        return name.endsWith("a") ? Optional.of(new Human(name)) : Optional.empty();
    }

}

