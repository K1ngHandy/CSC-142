package week13;

public class Contains {
    public static void main(String[] args) {
        int[] a1 = { 1, 6, 2, 1, 4, 1, 2, 1, 8 };
        int[] a2 = { 1, 2, 1 };

        System.out.println(contains(a1, a2));
    }

    public static boolean contains(int[] a1, int[] a2) {
        boolean res = false;
        for (int i = 0; i <= a1.length - 3; i++) {
            if (a1[i] == a2[0] && a1[i + 1] == a2[1] && a1[i + 2] == a2[2]) {
                res = true;
            }
        }
        return res;
    }
}
