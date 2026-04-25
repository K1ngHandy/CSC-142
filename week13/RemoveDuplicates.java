package week13;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // remove duplicate characters in string

        System.out.println(removeDuplicates("striiinnnggg"));
    }

    public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder newStr = new StringBuilder();
        newStr.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }
}
