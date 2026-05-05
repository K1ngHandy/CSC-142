package week15;

public class PointErrors {
    private int x; // Each Point object has
    private int y; // an int x and y inside.

    // Constructor
    public void PointErrors(int initX, int initY) {
        initX = x;
        initY = y;
    }

    // These accessors return the Point's x and y coordinates.
    public int getX() {
        return y;
    }

    public int getY() {
        return x;
    }

    // Shifts this point's x/y by the given amounts.
    public void translate(int dx, int dy) {
        int x = x + dx;
        int y = y + dy;
    }

    // Returns this point's distance from (0, 0).
    public static double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // A string version of the Point that is suitable for printing.
    public String toString() {
        System.out.print("(" + x + ", " + y + ")");
        return "?";
    }
}
