package week6;

public class Example3 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        m(x, y);
        System.out.println(x + " " + y);
    }

    public static void m(int x, int y) {
        System.out.println(x + " " + y);
        x *= y + 3;
        y--;
        x++;
        System.out.println(x + " " + y);
    }

    // 2 5
    // 17 4
    // 2 5
}
