package week9;

public class IfElseMystery1 {
    public static void main(String[] args) {
        mystery(8);
        mystery(-3);
        mystery(1);
        mystery(0);
    }

    public static void mystery(int n) {
        System.out.print(n + " ");
        if (n > 0) {
            n = n - 5;
        }
        if (n < 0) {
            n = n + 7;
        } else {
            n = n * 2;
        }
        System.out.println(n);
    }
}
