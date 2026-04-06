package week10;

import java.util.Scanner;

public class AddNumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 2 base-10 integers to sum: ");
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(addNumeric(str1, str2));
    }

    public static String addNumeric(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        int i = str1.length() - 1;
        int j = str2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? str1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? str2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
