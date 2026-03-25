package week10;

public class StringModify {
    public static void main(String[] args) {
        // immutable
        String s = "wcu Rams";
        s.toUpperCase();
        System.out.println(s); // "wcu Rams"
        // s is assigned...
        s = s.toUpperCase();
        System.out.println(s); // "WCU RAMS"

        String s2 = "wcu rams";
        s2 = s.substring(0, s.length());
        s2 += "!";
        System.out.println(s2); // "WCU RAMS!"

        String s3 = "Football";
        String s4 = s3.substring(4, 8);
        s4.substring(1);
        System.out.println(s4); // "ball"
    }
}
