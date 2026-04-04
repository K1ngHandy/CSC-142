package week10;

import java.util.Scanner;

public class AddCommas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number string: ");
        String number = sc.next();

        System.out.println(addCommas(number));
        sc.close();
    }

    public static String addCommas(String number) {
        StringBuilder sb = new StringBuilder(number);
        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(1, ",");
        }
        return sb.toString();
    }
}
