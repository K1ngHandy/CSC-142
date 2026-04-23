package week13;

public class Contains {
    public static boolean contains(int[] a1, int[] a2) {
        for (int i = 0; i <= a1.length - a2.length; i++) {
            boolean match = true;

            if (a1[i + j] != a2[j]) {
                match = false;
                break;
            }

            if (match) {
                return true;
            }
        }
    }
}
