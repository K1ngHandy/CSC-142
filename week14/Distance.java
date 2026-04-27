package week14;

import java.util.Random;

public class Distance {
    public static void main(String[] args) {
        Random r = new Random();

        Point[] arr = new Point[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Point(r.nextInt(21) - 10, r.nextInt(21) - 10);
        }

        double max = 0;
        Point maxP1 = null;
        Point maxP2 = null;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getDistance(arr[j]) > max) {
                    max = arr[i].getDistance(arr[j]);
                    maxP1 = arr[i];
                    maxP2 = arr[j];
                }
            }
        }
        System.out.println("distance between (" + maxP1.x + ", " + maxP1.y + ") and (" + maxP2.x + ", " + maxP2.y
                + ") is " + max);
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
