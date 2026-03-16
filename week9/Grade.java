package week9;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What percentage did you earn? ");

        double percent = sc.nextDouble();

        if (percent >= 90) {
            System.out.println("You got an A!");
        } else if (percent >= 80) {
            System.out.println("You got a B!");
        } else if (percent >= 70) {
            System.out.println("You got an C.");
        } else if (percent >= 60) {
            System.out.println("You got a D.");
        } else {
            System.out.println("You got an F...");
        }
    }
}
