package week13;

import java.util.Random;

public class LargestDistance {
    public static void main(String[] args) {
        Point[] arr = new Point[10];
        Random r = new Random();

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = new Point();
            // arr[i].x = (int) (Math.random() * 100);
            // arr[i].y = (int) (Math.random() * 100);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i].x = r.nextInt(21) - 10;
            arr[i].y = r.nextInt(21) - 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("(" + arr[i].x + ", " + arr[i].y + ")");
        }

        // largestDistance();
    }

    public static void largestDistance() {
        //
    }
}
