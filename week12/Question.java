package week12;

public class Question {
    public static void main(String[] args) {
        question();
    }

    public static void question() {
        int[] a = { 1, 7, 5, 6, 4, 14, 11 };

        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(i + ": " + a[i]);
            if (a[i] > a[i + 1]) {
                a[i + 1] = a[i + 1] * 2;
                System.out.println("   " + a[i]);
            }
        }
    }
}
