package week15;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double circumference() {
        return 2 * Math.PI * r;
    }

    public double getRadius() {
        return r;
    }

    public String toString() {
        return "Circle{radius=" + r + "}";
    }

    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        System.out.println(c.toString());
    }
}
