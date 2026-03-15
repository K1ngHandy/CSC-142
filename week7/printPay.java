package week7;

public class PrintPay {
    public static final double SALARY = 10.0;
    public static final int HOURS = 40;

    public static void main(String[] args) {
        printPay(SALARY, HOURS);
    }

    public static int printPay(double salary, int hours) {
        System.out.println("Hours worked: " + hours);
        System.out.print("Pay Earned: " + salary * hours);
    }
}
