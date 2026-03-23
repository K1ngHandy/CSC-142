package week9;

import java.util.Scanner;

public class EvenSumMax {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        evenSumMax(console);
    }

    public static void evenSumMax(Scanner console) {
        System.out.print("how many integers? ");
        int count = console.nextInt();

        int evenSum = 0;
        int max = 0;
        boolean isEven = false;

        for (int i = 0; i < count; i++) {
            System.out.print("next integer? ");
            int num = console.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
                if (!isEven || num > max) {
                    max = num;
                }
                isEven = true;
            }
        }

        System.out.println(" even sum = " + evenSum);
        System.out.println("even max = " + (isEven ? max : "none"));
    }
}
