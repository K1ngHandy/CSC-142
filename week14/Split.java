package week14;

public class Split {
    public static void main(String[] args) {
        int[] a = { 18, 7, 4, 24, 11 };
        // int[] newStr = { 9, 9, 4, 3, 2, 2, 12, 12, 6, 5 };

        int[] res = split(a);
        System.out.println(java.util.Arrays.toString(res));
    }

    public static int[] split(int[] a) {
        int[] newArr = new int[a.length * 2];

        for (int i = 0; i < a.length; i++) {
            newArr[i * 2] = (a[i] + 1) / 2;
            newArr[i * 2 + 1] = a[i] / 2;
        }

        return newArr;
    }
}
