package week14;

import java.util.Arrays;

public class ReferenceMystery4 {
    public static void main(String[] args) {
        int[] a = { 2, 0, 1 };
        int b = 3;
        mystery(a, b, a[0]);
        System.out.println(Arrays.toString(a) + " " + b);

        b = a[0] + a[1] + a[2];
        mystery(a, a[1], a[2]);
        System.out.println(Arrays.toString(a) + " " + b);
    }

    public static void mystery(int[] a, int b, int c) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 2;
        }
        b++;
        c--;
        System.out.println(Arrays.toString(a) + " " + b + " " + c);
    }
}
