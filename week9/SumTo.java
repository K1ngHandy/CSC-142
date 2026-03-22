package week9;

public class SumTo {
    public static void main(String[] args) {
        int res = sumTo(3);
        System.out.println(res);
    }

    public static int sumTo(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            // int sum = 0;
            sum += i;
        }
        return sum;
    }
}