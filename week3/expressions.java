package week3;

public class expressions {
    public static void main(String[] args) {
        String str1 = 2 + 6 + "cs";
        String str2 = "cs 123" + 2 + 6;
        double dbl1 = 1 + 9 / 2 * 2.0;
        double dbl2 = 46 / 3 / 2.0 / 3 * 4 / 5;
        double dbl3 = 50 / 9 / 2.0 + 200 / 10 / (5.0 / 2);

        String str3 = "hello" + 42;
        String str4 = 1 + "abc" + 2;
        String str5 = "abc" + 1 + 2;
        String str6 = "abc" + (1 + 2);
        String str7 = 1 + 2 + "abc";
        String str8 = "abc" + 9 * 3;
        String str9 = "1" + 1;
        String str10 = 1 + 1 + 1 + "1" + 1 + 1 + 1;
        String str11 = 4 - 1 + "abc";

        // System.out.println(str1);
        // System.out.println(str2);
        // System.out.println(dbl1);
        // System.out.println(dbl2);
        // System.out.println(dbl3);

        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(str9);
        System.out.println(str10);
        System.out.println(str11);
    }
}
