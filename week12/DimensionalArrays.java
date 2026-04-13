package week12;

import java.util.Arrays;

public class DimensionalArrays {
    public static void main(String[] args) {
        arrayExample();
    }

    public static void arrayExample() {
        // 3 rows, 4 columns
        int[][] mat = new int[3][4];

        // empty array
        System.out.println(mat[1][2]);
        // add value
        mat[1][2] = 3;

        // value at 1, 2
        System.out.println(mat[1][2]);

        // [0, 0, 0, 0]
        System.out.println(Arrays.toString(mat[0]));
        // [0, 0, 3, 0]
        System.out.println(Arrays.toString(mat[1]));

        // row 2 length – 4
        System.out.println(mat[2].length);

        // 3
        System.out.println(mat[1][2]);
    }
}
