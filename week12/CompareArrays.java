package week12;

public class CompareArrays {
    public static void main(String[] args) {
        int[] a1 = { 42, -7, 1, 15 };
        int[] a2 = { 42, -7, 1, 15 };

        System.out.println(compareArrays(a1, a2));
    }

    public static boolean compareArrays(int[] a1, int[] a2) {
        if (a1.length != a2.length)
            return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i])
                return false;
        }
        return true;
    }
}
