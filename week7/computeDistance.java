package week7;

public class computeDistance {
    public static final int X1 = 10;
    public static final int Y1 = 2;
    public static final int X2 = 3;
    public static final int Y2 = 5;

    public static void main(String[] args) {
        double res = computeDistance(X1, Y1, X2, Y2);
        System.out.print("Compute Distance: " + res);
    }

    public static double computeDistance(int X1, int Y1, int X2, int Y2) {
        // distance formula
        return Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));
    }
}
