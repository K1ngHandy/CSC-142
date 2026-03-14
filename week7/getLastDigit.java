package week7;

public class getLastDigit {
    public static final int DIGIT = 3572;

    public static void main(String[] args) {
        int res = getLastDigit(DIGIT);
        System.out.print("Res: " + res);
    }

    public static int getLastDigit(int digit) {
        int remainder = Math.abs(digit % 10);
        return remainder;
        // remainder of digit / 10 is last digit from moving decimal point
    }
}
