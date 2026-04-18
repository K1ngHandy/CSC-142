package week13;

public class ArrayMysteryExam5 {
    public static void main(String[] args) {
        int[] a1 = { 2, 4 };
        int[] a2 = { 1, 3, 6 };
        int[] a3 = { 7, 2, 8, 4 };
        int[] a4 = { 5, 2, 7, 2, 4 };
        int[] a5 = { 2, 4, 6, 3, 7, 9 };

        System.out.println("Before: " + java.util.Arrays.toString(a1));
        arrayMystery(a1);
        System.out.println("After:  " + java.util.Arrays.toString(a1));

        System.out.println("Before: " + java.util.Arrays.toString(a2));
        arrayMystery(a2);
        System.out.println("After:  " + java.util.Arrays.toString(a2));

        System.out.println("Before: " + java.util.Arrays.toString(a3));
        arrayMystery(a3);
        System.out.println("After:  " + java.util.Arrays.toString(a3));

        System.out.println("Before: " + java.util.Arrays.toString(a4));
        arrayMystery(a4);
        System.out.println("After:  " + java.util.Arrays.toString(a4));

        System.out.println("Before: " + java.util.Arrays.toString(a5));
        arrayMystery(a5);
        System.out.println("After:  " + java.util.Arrays.toString(a5));
    }

    public static void arrayMystery(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                a[i] = a[i + 1];
            }
        }
    }
}
