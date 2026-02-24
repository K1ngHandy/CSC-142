package week6;

public class forLoops {
    public static void main(String[] args) {
        int total = 0;

        // Nested for loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
