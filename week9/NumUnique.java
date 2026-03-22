package week9;

public class NumUnique {
    public static void main(String[] args) {
        int res1 = numUnique(18, 3, 4);
        int res2 = numUnique(6, 7, 6);
        System.out.println(res1);
        System.out.println(res2);
    }

    public static int numUnique(int a, int b, int c) {
        int unique = 0;
        if (a == b && b == c) {
            unique = 1;
        } else if (a == b || a == c || b == c) {
            unique = 2;
        } else if (a != b && a != c && b != c) {
            unique = 3;
        }
        return unique;
    }
}
