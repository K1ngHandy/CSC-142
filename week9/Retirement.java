package week9;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your age: ");
        int age = sc.nextInt();

        if (age <= 0) {
            System.out.println("Age must be > 0.");
        } else if (age > 65) {
            System.out.println((age - 65) + " years retired.");
        } else {
            System.out.println((65 - age) + " years until retirement.");
        }
    }
}
