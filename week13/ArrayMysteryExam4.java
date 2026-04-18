package week13;

import java.util.Arrays;

public class ArrayMysteryExam4 {
    public static void main(String[] args) {
        // int[] a = { 6, 2, 4 };
        // int[] a = { 4, 2, 3, 1, 2, 5 };
        int[] a = { 6, 0, -1, 3, -2, 0, 4 };

        arrayMysteryExam4(a);
    }

    public static void arrayMysteryExam4(int[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] = a[a.length - 1 - i] - a[i - 1];
        }
        System.out.println(Arrays.toString(a));
    }
}
