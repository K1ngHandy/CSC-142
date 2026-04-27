package week14;

public class MultipleConstructors {
    public static void main(String[] args) {
        Point p1 = new Point(); // default
        Point p2 = new Point(2, 3); // non-default

        System.out.println(p1.x + "," + p1.y);
        System.out.println(p2.x + "," + p2.y);
    }
}

class Point {
    int x;
    int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
