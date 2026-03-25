package week10;

public class Example {
    public static void main(String[] args) {
        // not primitive data type
        // address of "Hello" in memory is stored in s1
        String s1 = "Hello";
        // method m returns address of "Hello" in memory, which is stored in s3
        String s3 = m(s1);
        System.out.println(s3);
    }

    public static String m(String s2) {
        System.out.println(s2);
        return s2;
    }
}
