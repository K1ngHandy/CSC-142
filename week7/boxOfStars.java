package week7;

public class boxOfStars {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 5;

    public static void main(String[] args) {
        boxOfStars(WIDTH, HEIGHT);
    }

    public static void boxOfStars(int WIDTH, int HEIGHT) {
        starsRow();
        centerRows();
        starsRow();
    }

    public static void starsRow() {
        for (int i = 1; i <= WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void centerRows() {
        for (int j = 1; j <= HEIGHT - 2; j++) {
            System.out.print("*");
            for (int k = 1; k <= WIDTH - 2; k++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
