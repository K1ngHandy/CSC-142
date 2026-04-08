package week12;

public class Ex2 {
    public static void main(String[] args) {
        example2();
    }

    public static void example2() {
        String[] a = new String[5];
        a[1] = "Peter";
        a[3] = "Tom";

        System.out.println(a[0].length()); // run-time error because a[0] value is null
    }
}
