package week6;

public class Scope {
    public static void main(String[] args) {
        // for (int i = 0; i < 10; i++) {
        // System.out.println("x");

        // for (int j = 0; j < i; j++) {
        // System.out.println("y");
        // }

        // System.out.println("z");

        // for (int k = 0; k < i; k++) {
        // System.out.println("w");
        // }
        // }
        printNum(4, 9);
        printNum(17, 6);
        printNum(8, 0);
        printNum(0, 8);
    }

    public static void printNum(int x, int y) {
        for (int i = 1; i <= y; i++)
            System.out.print(x);
        System.out.println();

        // 444444444
        // 171717171717

        // 00000000
    }
}
