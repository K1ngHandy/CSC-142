package week10;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        // capture the first word of the input
        String name = sc.next();
        // or equals()
        if (name.equalsIgnoreCase("Olivia")) {
            System.out.println("My name is Olivia,");
            System.out.println("Nice to meet you!");
        } else {
            System.out.println("Who?");
        }
    }
}
