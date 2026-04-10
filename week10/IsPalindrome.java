package week10;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(input.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
