package week10;

import java.util.Scanner;

public class AddCommas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number string: ");
        String number = sc.next();

        addCommas("12345678");
    }

    public static void addCommas(String number) {
        System.out.println(number.substring(number.length() - 3));
    }
}
