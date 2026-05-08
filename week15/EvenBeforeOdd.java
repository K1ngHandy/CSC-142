package week15;

import java.util.Arrays;

public class EvenBeforeOdd {
    public static int[] evenBeforeOdd(int[] arr) {
        int evenIndex = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[evenIndex];
                arr[evenIndex] = temp;
                evenIndex++;
            }
        }

        for (int i = 0; i < evenIndex - 1; i++) {
            for (int j = i + 1; j < evenIndex; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = evenIndex; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 11, 9, 10, 4, 7, 3 };
        System.out.println(Arrays.toString(evenBeforeOdd(arr)));
    }
}
