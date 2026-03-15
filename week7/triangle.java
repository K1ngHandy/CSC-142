package week7;

public class Triangle {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        triangle(SIZE);
    }

    public static void triangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= -1 * i + size; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
