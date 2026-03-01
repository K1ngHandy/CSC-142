package week6;

public class AsciiFigure {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        for (int i = 1; i <= SIZE; i++) {
            // "/"
            for (int j = 1; j <= 4 * (SIZE - i); j++) {
                System.out.print("/");
            }
            // "*"
            for (int j = 1; j <= 8 * (i - 1); j++) {
                System.out.print('*');
            }
            // "\"
            for (int j = 1; j <= 4 * (SIZE - i); j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
