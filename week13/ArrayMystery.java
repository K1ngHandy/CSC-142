package week13;

import java.util.Arrays;

public class ArrayMystery {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5 };
        System.out.println("Before: " + Arrays.toString(list));
        arrayMystery(list);
        System.out.println("After:  " + Arrays.toString(list));
    }

    public static void arrayMystery(int[] list) {
        for (int i = 1; i < list.length; i++) {
            list[i] = list[i] + list[i - 1];
        }
    }
}
