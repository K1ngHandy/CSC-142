package week9;

import java.util.Scanner;

public class TwoInputs {
    // Input 2 numbers to calculate product
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please type 2 numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int product = x * y;
        System.out.println("The product is " + product);
    }
}
