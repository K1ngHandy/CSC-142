package week11;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Weather {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("week11/weather.txt"))) {
            int tries = 0;
            while (tries < 3 && sc.hasNextDouble()) {
                double value = sc.nextDouble();
                System.out.println(value);
                tries++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        }
    }
}
