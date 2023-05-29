package algorithms_01._01_Arrays.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        names.add("Kevin");
        names.add("Daniel");
        names.add("Adam");
        names.add("Ana");

        // O(N)
//        names.remove(0);

        System.out.println(names.size());

        for(String name: names) {
            System.out.println(name);
        }
    }

    public static void oneDimensionalArray() {
        int[] nums = new int[10];

        System.out.println(Arrays.toString(nums));

        // O(1)
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        nums[0] = 100;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 6)
                System.out.println("We have found the item at index: " + i);
        }

        System.out.println(Arrays.toString(nums));
    }
}
