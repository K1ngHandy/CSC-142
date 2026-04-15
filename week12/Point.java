package week12;

public class Point {
    public int x;
    public int y;

    public void translate(int dx, int dy) {
        // this is current instance of the class, so we can use this to refer to the
        // current instance variables
        this.x += dx;
        this.y += dy;
    }

    public double distanceFrom(Point p) {
        //
    }
}
