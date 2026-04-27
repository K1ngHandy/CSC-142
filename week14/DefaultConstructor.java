package week14;

public class DefaultConstructor {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 100;
        p.y = 200;

        System.out.println(p.x + ", " + p.y);
    }
}

class Point {
    int x;
    int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
