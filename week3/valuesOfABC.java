package week3;

public class valuesOfABC {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = b;

        a = a + 1;
        b = b - 1;
        c = c + a;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }
}