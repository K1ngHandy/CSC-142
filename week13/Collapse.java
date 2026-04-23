package week13;

public class Collapse {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 8, 9, 4, 13, 7, 1, 9, 10 };

        System.out.println(collapse(arr));
    }

    public static int[] collapse(int[] arr) {
        int[] returnArr = new int[(arr.length + 1) / 2];
        int output = 0;

        for (int i = 0; i + 1 < arr.length; i += 2) {
            returnArr[output] = arr[i] + arr[i + 1];
            output++;
        }

        // odd length, last index
        if (arr.length % 2 == 1) {
            returnArr[output] = arr[arr.length - 1];
        }

        return returnArr;
    }
}
