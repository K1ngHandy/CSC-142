package week7;

public class Factorial {
    public static final int N = 4;

    public static void main(String[] args) {
        System.out.println(factorial(N));
    }

    public static int factorial(int N) {
        int res = 1;
        for (int i = 1; i <= N; i++) {
            res *= i;
        }
        return res;
    }
}
