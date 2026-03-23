package week9;

public class Quadrant {
    public static void main(String[] args) {
        quadrant(12.4, 17.8);
        quadrant(-2.3, 3.5);
        quadrant(-15.2, -3.1);
        quadrant(4.5, -42.0);
        quadrant(0.0, 3.14);
    }

    public static void quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            System.out.print("1");
        } else if (x < 0 && y > 0) {
            System.out.print("2");
        } else if (x < 0 && y < 0) {
            System.out.print("3");
        } else if (x > 0 && y < 0) {
            System.out.print("4");
        } else {
            System.out.print("0");
        }
        System.out.println();
    }
}
