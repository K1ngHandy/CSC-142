package week14;

public class SwitchPairs {
    public static void main(String[] args) {
        String[] a = { "a", "bb", "c", "ddd", "ee", "f", "g" };

        switchPairs(a);
    }

    public static int[] switchPairs() {
        int[] switch = new String[a.length];

        for (int i = 0; i < a.length; i++) {
            switch[i] = a[i + 1];
            switch[i + 1] = a[i];
        }

        return switch
    }
}
