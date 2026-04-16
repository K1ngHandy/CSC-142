package week10;

import java.util.Scanner;

public class RemoveAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string, then char to remove: ");
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        System.out.println(removeAll(str, ch));
    }

    public static String removeAll(String str, char ch) {
        return str.replace(Character.toString(ch), "");
    }
}
