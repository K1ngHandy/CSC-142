package week10;

public class Example {
    public static void main(String[] args) {
        // not primitive data type
        // address of "Hello" in memory is stored in s1
        String s1 = "Hello";
        // method m returns address of "Hello" in memory, which is stored in s3
        String s3 = m(s1);
        System.out.println(s3);

        int n = 91;
        int f = 2;
        while (n % f != 0) {
            f++;
        }
        System.out.println("F: " + f);
    }

    public static String m(String s2) {
        System.out.println(s2);
        return s2;
    }

    // public static int Sum() {
    // int sum = 0;
    // int limit = 60;
    // int val = 1;

    // //
    // }
}
