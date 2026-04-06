package week10;

import java.util.Scanner;

public class ContainsTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string, then character: ");
        String str = sc.next();
        char character = sc.next().charAt(0);

        System.out.println(containsTwice(str, character));
    }

    public static boolean containsTwice(String str, char character) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }

            if (count >= 2) {
                return true;
            }
        }
        return false;
    }
}
