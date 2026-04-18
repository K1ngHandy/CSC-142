package week13;

import java.util.Arrays;

public class ArrayMystery2 {
    public static void main(String[] args) {
        // int[] list = { 6, 3 };
        // int[] list = { 2, 4, 6 };
        // int[] list = { 1, 2, 3, 4 };
        // int[] list = { 2, 2, 2, 2, 2 };
        int[] list = { 7, 3, 2, 0, 5, 1 };

        System.out.println("Before: " + Arrays.toString(list));
        arrayMystery2(list);
        System.out.println("After:  " + Arrays.toString(list));
    }

    public static void arrayMystery2(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (i % 2 == 0) {
                list[i]++;
            } else {
                list[i]--;
            }
        }
    }
}
