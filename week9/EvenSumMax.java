package week9;

import java.util.Scanner;

public class EvenSumMax {
    public static void main(String[] args) {
        System.out.print("Input integers to sum: ");
        Scanner console = new Scanner(System.in);
        int nums = console.nextInt();
        evenSumMax(nums);
    }

    public static int evenSumMax(int nums) {
        int n = nums.length;

        for (int i = 1; i <= n.length; i++) {
            System.out.print("Number: " + n);
        }
    }
}
