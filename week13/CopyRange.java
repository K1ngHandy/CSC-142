package week13;

public class CopyRange {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5, 6 };
        int[] a2 = { 21, 22, 23, 24, 25, 26 };

        copyRange(a1, a2, 0, 3, 2);
    }

    public static void copyRange(int[] a1, int[] a2, int i1, int i2, int l) {
        for (int i = 0; i < l; i++) {
            a2[i2 + i] = a1[i1 + i];
        }
        System.out.println();
    }
}
