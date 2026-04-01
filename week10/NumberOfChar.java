package week10;

import java.util.Scanner;

public class NumberOfChar {
    public static void main(String[] args) {
        System.out.print("Type a line or nothing to exit ");
        Scanner sc = new Scanner(System.in);
        int total = 0;
        String x = sc.nextLine();
        int y = x.length();
        while (0 != y) {
            System.out.print("Type a line (or nothing to exit)");
            total += x.length();
            String z = sc.nextLine();
            y = z.length();
        }
        System.out.print("You typed a total of " + total + "chars.");
    }
}
