package week6;

public class Example {
    public static void main(String[] args) {
        // int x = 23;
        // m(x);
        // System.out.println(x);
        // // 23

        int x = 9;
        int y = 2;
        int z = 5;

        m(z, y, x);
        m(y, x, z);
    }

    public static void m(int x, int z, int y) {
        // x = x + 1;
        System.out.println(z + " " + (y - x));
    }
}
