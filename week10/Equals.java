package week10;

public class Equals {
    public static void main(String[] args) {
        System.out.println(equals("lorem", "ipsum"));
    }

    public static boolean equals(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (!s1.substring(i, i + 1).equals(s2.substring(i, i + 1))) {
                return false;
            }
        }
        return true;
    }
}
