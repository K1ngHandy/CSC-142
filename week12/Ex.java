package week12;

public class Ex {
    public static void main(String[] args) {
        example();
    }

    public static void example() {
        int[] a = new int[8]; // array of size 10
        a[1] = 3;
        a[4] = 99;
        a[6] = 2;
        int x = a[1];
        a[x] = 42;
        a[a[6]] = 11;

        System.out.println(a[1]);
        System.out.println(a[4]);
        System.out.println(a[6]);
    }
}
