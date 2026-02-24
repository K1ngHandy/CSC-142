package week6;

public class Scope {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("x");

            for (int j = 0; j < i; j++) {
                System.out.println("y");
            }

            System.out.println("z");

            for (int k = 0; k < i; k++) {
                System.out.println("w");
            }
        }
    }
}
