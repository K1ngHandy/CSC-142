package week13;

public class CountDuplicates {
    public static void main(String[] args) {
        int[] a = { 1, 4, 2, 4, 7, 1, 1, 9, 2, 3, 4, 1 };

        System.out.println(countDuplicates(a));
    }

    public static int countDuplicates(int[] a) {
        int duplicates = 0;

        for (int i = 0; i < a.length; i++) {
            boolean repeat = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    repeat = true;
                    break;
                }
            }
            if (repeat) {
                duplicates++;
            }
        }
        return duplicates;
    }
}
