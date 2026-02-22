package week5;

public class AsciiFigure {
    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.print("/");
        }
        for (int j = 0; j < 16; j++) {
            System.out.print("\\");
        }
        System.out.println();
        for (int k = 0; k < 12; k++) {
            System.out.print("/");
        }
        for (int l = 0; l < 8; l++) {
            System.out.print("*");
        }
        for (int m = 0; m < 12; m++) {
            System.out.print("\\");
        }
        System.out.println();
        // loop needs to change output based on line number
    }
}
