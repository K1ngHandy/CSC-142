package week10;

import java.util.Scanner;

public class NameDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string to convert to diamond: ");
        String str = sc.nextLine();

        nameDiamond(str);
    }

    public static void nameDiamond(String str) {
        // top
        for (int i = 1; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
        }
        // bottom
        for (int i = 1; i < str.length(); i++) {
            // repeats " " at start of line i times, then prints substring from i to end of
            // string
            System.out.println(" ".repeat(i) + str.substring(i));
        }
        System.out.println();
    }
}
