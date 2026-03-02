package week6;

public class floydsTriangle {
    public static final int K = 5;

    public static void main(String[] args) {
        floydsTriangle(K);
    }

    public static void floydsTriangle(int K) {
        if (K <= 0) {
            System.out.print("");
        }
        int counter = 1;
        for (int line = 1; line <= K; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
