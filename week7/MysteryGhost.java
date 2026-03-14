package week7;

public class MysteryGhost {
    public static void main(String[] args) {
        ghost(13);
    }

    private static void ghost(int x) {
        int y = 0;
        for (int i = 1; i < x; i *= 2) {
            y = witch(y, skeleton(x, i));
        }
        System.out.println("ghost: x = " + x + ", y = " + y);
    }

    private static int witch(int x, int y) {
        x = 10 * x + y;
        System.out.println("witch: x = " + x + ", y = " + y);
        return x;
    }

    private static int skeleton(int x, int y) {
        return x / y % 2;
    }
}
