package week11;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Ex {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("week11/Hours.txt");

        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                handleLine(line);
            }
        }
    }

    public static void handleLine(String line) {
        try (Scanner scLine = new Scanner(line)) {
            int id = scLine.nextInt();
            String last = scLine.next();

            double totalHours = 0.0;
            int days = 0;

            while (scLine.hasNextDouble()) {
                totalHours += scLine.nextDouble();
                days++;
            }

            if (days > 0) {
                System.out.println(
                        last + " (ID#" + id + ") worked " + totalHours + " (" + (totalHours / days) + " hours/day)");
            } else {
                System.out.println(last + " (ID#" + id + ") worked 0.0 hours");
            }
        }
    }
}
