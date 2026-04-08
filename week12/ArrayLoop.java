package week12;

public class ArrayLoop {
    public static void main(String[] args) {
        arrayLoop();
    }

    public static void arrayLoop() {
        int[] a = new int[8];

        for (int i = 0; i < a.length; i++) {
            a[i] = 2 * i;
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(i + ": " + a[i]);
        }
    }
}
