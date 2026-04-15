package week12;

public class Point {
    public int x;
    public int y;

    public void translate(int dx, int dy) {
        // this is current instance of the class
        this.x += dx;
        this.y += dy;
    }

    public double distanceBetween(Point p) {
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }

    public double distanceFromOrigin() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }
}
