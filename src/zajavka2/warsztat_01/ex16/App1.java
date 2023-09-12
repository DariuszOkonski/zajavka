package zajavka2.warsztat_01.ex16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.<String>naturalOrder().reversed();
        List<Book> booksList = Arrays.asList(
                new Book(111, "moja autobiografia"),
                new Book(53, "moja autobiografia"),
                new Book(41, "twoja autobiografia"),
                new Book(189, "moja autobiografia"));

        System.out.println(Collections.unmodifiableList(booksList));
//        Collections.sort(booksList);
        booksList.sort(Comparator.<Book>comparingInt(book -> book.getNumberOfPages()));
        System.out.println(Collections.unmodifiableList(booksList));
    }
}

