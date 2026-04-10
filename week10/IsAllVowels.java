package week10;

import java.util.Scanner;

public class IsAllVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        isAllVowels(input);
    }

    public static void isAllVowels(String input) {
        for (int i = 0; i < input.length(); i++) {
            //
        }
        System.out.print(input);
    }
}
