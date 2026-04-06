package week10;

import java.util.Scanner;

public class CrazyCaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string for crazy caps: ");
        String inputStr = sc.nextLine();

        System.out.print(crazyCaps(inputStr));
    }

    public static String crazyCaps(String inputStr) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < inputStr.length(); i++) {
            char current = inputStr.charAt(i);

            if (i % 2 == 0) {
                res.append(Character.toLowerCase(current)); // even
            } else {
                res.append(Character.toUpperCase(current)); // odd
            }
        }
        return res.toString();
    }
}
