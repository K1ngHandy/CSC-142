package week9;

import java.util.Scanner;

public class EvenSumMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many integers? ");
        int count = sc.nextInt();
        System.out.print("next integer? ");
        int num = sc.nextInt();

        evenSumMax(count, num);
    }

    public static boolean evenSumMax(int count, int num) {
        int evenSum = 0;
        int max = 0;
        boolean isEven = false;

        for (int i = 0; i < count; i++) {
            if (num % 2 == 0) {
                evenSum += num;
                if (!isEven) {
                    max = num;
                }
                isEven = true;
            }
        }

        System.out.println(" even sum = " + evenSum);
        System.out.println("even max = " + (isEven ? max : "none"));
    }
}
