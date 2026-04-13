package week12;

public class Point {
    public int x;
    public int y;

    public void translate(int dx, int dy) {
        // (x, y) -> (x + dx, y + dy)
    }

    public double distanceFromOrigin() {
        // distance formula: sqrt(x^2 + y^2)
        return Math.sqrt(x * x + y * y);
    }
}
