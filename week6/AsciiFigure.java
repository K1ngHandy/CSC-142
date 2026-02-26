package week6;

public class AsciiFigure {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 1; j <= -4 * i + 20; j++) {
                System.out.print("/");
            }
            for (int k = 1; k <= 6 * i - 4; k++) {
                System.out.print('*');
            }
            for (int l = 1; l <= -4 * i + 20; l++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
