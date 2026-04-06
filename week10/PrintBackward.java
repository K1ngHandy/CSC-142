package week10;

import java.util.Scanner;

public class PrintBackward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to print backwards: ");
        String forward = sc.nextLine();

        printBackward(forward);
    }

    public static void printBackward(String forward) {
        //
        for (int i = forward.length() - 1; i >= 0; i--) {
            System.out.print(forward.charAt(i));
        }
        System.out.println();
    }
}
