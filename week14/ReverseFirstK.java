package week14;

public class ReverseFirstK {
    public static void main(String[] args) {
        int[] a = { 10, -2, 33, 55, 9, 17, 6 };

        System.out.println(reverseFirstK(a, 5));
    }

    public static int[] reverseFirstK(int[] a, int k) {
        if (k <= 1 || k > a.length) {
            return a;
        }

        for (int i = 0; i < k / 2; i++) {
            int temp = a[i];
            a[i] = a[k - 1 - i];
            a[k - 1 - i] = temp;
        }

        return a;
    }
}
