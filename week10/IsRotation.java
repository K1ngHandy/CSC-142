package week10;

import java.util.Scanner;

public class IsRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 strings to check rotation: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(isRotation(str1, str2));
    }

    public static boolean isRotation(String str1, String str2) {
        // check rotation similarity
        return str1 != null && str2 != null && str1.length() == str2.length()
                && (str1.toLowerCase() + str1.toLowerCase()).contains(str2.toLowerCase());
    }
}
