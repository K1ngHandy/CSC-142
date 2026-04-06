package week10;

import java.util.Scanner;

public class ConvertToAltCaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to convert to alt caps: ");
        String str = sc.next();

        System.out.println(convertToAltCaps(str));
    }

    public static String convertToAltCaps(String str) {
        StringBuilder res = new StringBuilder();
        boolean upper = true;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (Character.isLetter(current)) {
                res.append(upper ? Character.toLowerCase(current) : Character.toUpperCase(current));
                upper = !upper;
            } else {
                res.append(current);
            }
        }
        return res.toString();
    }
}
