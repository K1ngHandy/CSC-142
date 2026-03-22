package week9;

import java.util.Scanner;

public class PercentageGrade {
    public static void main(String[] args) {
        System.out.print("What percentage did you earn? ");
        Scanner console = new Scanner(System.in);
        int percent = console.nextInt();
        percentageGrade(percent);
    }

    public static void percentageGrade(int percent) {
        if (percent >= 90) {
            System.out.println("You got an A!");
        } else if (percent >= 80) {
            System.out.println("You got a B!");
        } else if (percent >= 70) {
            System.out.println("You got a C!");
        } else if (percent >= 60) {
            System.out.println("You got a D!");
        } else {
            System.out.println("You got an F!");
        }
    }
}