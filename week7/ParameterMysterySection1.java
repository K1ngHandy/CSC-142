package week7;

public class ParameterMysterySection1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c = -2;

        m(a, b, c);
        m(c, 3, a);
        m(a + b, b + c, c + a);
    }

    public static void m(int c, int a, int b) {
        System.out.println(b + " + " + c + " = " + a);
    }
}
