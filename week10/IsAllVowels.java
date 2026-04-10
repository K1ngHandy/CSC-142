package week10;

import java.util.Scanner;

public class IsAllVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        isAllVowels(input);

        if (isAllVowels(input)) {
            System.out.println("All characters are vowels.");
        } else {
            System.out.println("Not all vowels.");
        }
    }

    public static boolean isAllVowels(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                return false;
            }
        }
        return true;
    }
}
