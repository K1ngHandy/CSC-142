package week7;

public class getLastDigit {
    public static final int DIGIT = 3572;

    public static void main(String[] args) {
        System.out.print(getLastDigit(DIGIT));
    }

    public static int getLastDigit(int digit) {
        Math.abs(digit % 10);
        // remainder of digit / 10 is last digit from moving decimal point
    }
}
