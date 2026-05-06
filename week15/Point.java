package week15;

public class Point {
    private int x; // Each Point object has
    private int y; // an int x and y inside.

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // These accessors return the Point's x and y coordinates.
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // Shifts this point's x/y by the given amounts.
    public void translate(int dx, int dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    // Returns this point's distance from (0, 0).
    public static double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // A string version of the Point that is suitable for printing.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point p = new Point(4, 3);
        System.out.println(p.toString());

        Point p1 = new Point(17, 9);
        Point p2 = new Point(4, -1);
        Point p3 = p2;

        p1.translate(3, 1);
        p2.x = 50;
        p3.translate(-4, 5);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
