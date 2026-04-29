package week14;

import java.util.Arrays;

public class ReferenceMystery3 {
    public static void main(String[] args) {
        int x = 1;
        int[] a = new int[2];
        mystery(x, a);
        System.out.println(x + " " + Arrays.toString(a));

        x--;
        a[1] = a.length;
        mystery(x, a);
        System.out.println(x + " " + Arrays.toString(a));
    }

    public static void mystery(int x, int[] a) {
        a[x]++;
        x++;
        System.out.println(x + " " + Arrays.toString(a));
    }
}
