package week6;

public class numberLoops4constant {
    // size constant
    public static int SIZE = 5;

    public static void main(String[] args) {
        for (int i = 1; i <= SIZE; i++) {
            // dots before number
            for (int j = 1; j <= SIZE - i; j++) {
                System.out.print(".");
            }
            // number
            System.out.print(i);
            // dots after number
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
