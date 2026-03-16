package week7;

public class SumOfRange {
    public static final int MIN = 3;
    public static final int MAX = 7;

    public static void main(String[] args) {
        System.out.println(sumOfRange(MIN, MAX));
    }

    public static int sumOfRange(int min, int max) {
        int sum = 0;

        if (min > max) {
            sum = 0;
        } else {
            for (int i = min; i <= max; i++) {
                sum += i;
            }
            return sum;
        }

        return sum;
    }
}
