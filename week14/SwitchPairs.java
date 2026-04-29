package week14;

import java.util.Arrays;

public class SwitchPairs {
    public static void main(String[] args) {
        String[] a = { "a", "bb", "c", "ddd", "ee", "f", "g" };

        System.out.println(Arrays.toString(switchPairs(a)));
    }

    public static String[] switchPairs(String[] a) {
        for (int i = 0; i < a.length - 1; i += 2) {
            String temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }

        return a;
    }
}
