package week12;

public class QuickArray {
    public static void main(String[] args) {
        quickArray();
    }

    public static void quickArray() {
        int[] a = { 12, 49, -2, 26, 5, 17, -6 };
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + ": " + a[i]);
        }
    }
}
