package zajavka.week_08.day38ext;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Gliwice");
        arrayList.add("Warszawa");
        printAllElements(arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Gliwice");
        linkedList.add("Warszawa");
        printAllElements(linkedList);

        Set<String> setList = new HashSet<>();
        setList.add("Gliwice");
        setList.add("Warszawa");
        printAllElements(setList);
    }

    public static void printAllElements(Collection<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
