package week12;

public class Translate {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 3;
        p1.y = 4;
        p1.translate(1, 2);

        Point p2 = new Point();
        p2.x = 30;
        p2.y = 40;
        p2.translate(50, -50);

        System.out.println("Distance between points: " + p1.distanceBetween(p2));
        System.out.println("Distance from origin: " + p1.distanceFromOrigin());
    }
}
