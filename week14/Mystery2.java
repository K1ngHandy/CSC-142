package week14;

import java.util.Arrays;

public class Mystery2 {
    public static void main(String[] args) {
        int[] a1 = { 42, 42 };
        int[] a2 = { 6, 2, 4 };
        int[] a3 = { 7, 7, 3, 8, 2 };
        int[] a4 = { 4, 2, 3, 1, 2, 5 };
        int[] a5 = { 6, 0, -1, 3, 5, 0, -3 };

        System.out.println(Arrays.toString(arrayMystery2(a1)));
        System.out.println(Arrays.toString(arrayMystery2(a2)));
        System.out.println(Arrays.toString(arrayMystery2(a3)));
        System.out.println(Arrays.toString(arrayMystery2(a4)));
        System.out.println(Arrays.toString(arrayMystery2(a5)));
    }

    public static int[] arrayMystery2(int[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            a[i] = a[i - 1] - a[i] + a[i + 1];
        }

        return a;
    }
}
