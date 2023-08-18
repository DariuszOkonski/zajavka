package java_A_Z.section09.ex1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] nums1 = {1,5,3,10,15,0};
        int[] nums2 = {1,5,3,10,15,0};
        int[] copyArray = Arrays.copyOf(nums1, nums1.length);

        System.out.println(Arrays.toString(copyArray));
        System.out.println(copyArray);
        System.out.println(nums1);
    }
}
