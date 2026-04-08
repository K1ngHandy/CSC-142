package week12;

import java.util.Arrays;

public class CompareArrays2 {

    public static void main(String[] args) {
        int[] a1 = { 42, -7, 1, 15 };
        int[] a2 = { 42, -7, 1, 15 };

        System.out.println(compareArrays2(a1, a2));
    }

    public static boolean compareArrays2(int[] a1, int[] a2) {
        return !Arrays.equals(a1, a2);
    }
}
