package week7;

public class PrintPay {
    public static final double SALARY = 10.00;
    public static final int HOURS = 11;

    public static void main(String[] args) {
        printPay(SALARY, HOURS);
    }

    public static double printPay(double salary, int hours) {
        double pay;

        if (hours > 8) {
            pay = salary * 8 + (hours - 8) * salary * 1.5;
        } else {
            pay = salary * hours;
        }

        System.out.println("Hours worked: " + hours);
        System.out.printf("Pay earned: $%.2f%n", pay);

        return pay;
    }
}
