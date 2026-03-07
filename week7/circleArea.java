package week7;

public class circleArea {
    public static final double RADIUS = 2.0;

    public static void main(String[] args) {
        double res = circleArea(RADIUS);
        System.out.print(res);
    }

    public static double circleArea(double RADIUS) {
        // area = pi * r ^ 2
        double area = Math.PI * Math.pow(RADIUS, 2);
        return area;
    }
}
