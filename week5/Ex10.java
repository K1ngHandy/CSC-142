package week5;

public class Ex10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int dot = 1; dot <= -1 * i + 5; dot++) {
                System.out.print(".");
            }
            System.out.print(i);
            for (int dot = 1; dot <= i - 1; dot++) {
                System.out.print(".");
            }
            System.out.println();
            // ....1
            // ...2.
            // ..3..
            // .4...
            // 5....
        }
    }
}
