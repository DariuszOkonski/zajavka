package zajavka.week_08.day36ext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Whatever");
        listOfStrings.add("Element");
        listOfStrings.add("Whatever");
        listOfStrings.add("Hello");
        System.out.println(listOfStrings);

        String[] ourPrettyArray = listOfStrings.toArray(new String[0]);
        System.out.println(Arrays.toString(ourPrettyArray));

    }
}
