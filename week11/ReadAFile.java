package week11;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ReadAFile {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(newFile("in.txt"));
        // same, condensed

        try {
            File f = new File("in.txt");
            Scanner sc = new Scanner(f);
            String text = sc.nextLine();
            System.out.println(text);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
