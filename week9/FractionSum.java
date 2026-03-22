package week9;

public class FractionSum {
    public static void main(String[] args) {
        System.out.println(fractionSum(1));
        System.out.println(fractionSum(2));
        System.out.println(fractionSum(15));
    }

    public static double fractionSum(int n) {
        double sum = 1.0;

        for (int i = 2; i <= n; i++) {
            sum += (1.0 / i);
            // 1 + (1/2) + (1/3) + (1/4) + (1/5) + ...
        }
        return sum;
    }
}
