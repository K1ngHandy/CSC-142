package week10;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string for word count: ");
        String strInput = sc.nextLine();

        System.out.println(countWords(strInput));

    }

    public static int countWords(String strInput) {
        int count = 0;

        if (strInput.isEmpty()) {
            return count;
        } else {
            String regex = "\\s+";
            count = strInput.trim().split(regex).length;
            return count;
        }
    }
}
