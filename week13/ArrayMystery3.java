package week13;

import java.util.Arrays;

public class ArrayMystery3 {
    public static void main(String[] args) {
        // int[] nums = { 42 };
        // int[] nums = { 14, 7 };
        // int[] nums = { 7, 1, 3, 2, 0, 4 };
        // int[] nums = { 10, 8, 9, 5, 5 };
        int[] nums = { 12, 11, 10, 10, 8, 7 };

        System.out.println("Before: " + Arrays.toString(nums));
        arrayMystery3(nums);
        System.out.println("After:  " + Arrays.toString(nums));
    }

    public static void arrayMystery3(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                nums[i + 1]++;
            }
        }
    }
}
