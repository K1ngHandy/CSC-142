package week15;

public class AverageOfNeighborhood {
    // mat != null, mat is rectangular, mat.length > 0, mat[0].length > 0
    // cenRow and cenCol are in bounds. rows >= 0, cols >= 0
    public static double averageOfNeighborhood(int[][] mat,
            int cenRow, int cenCol, int rows, int cols) {
        int numRows = mat.length;
        int numCols = mat[0].length;

        int rStart = Math.max(0, cenRow - rows);
        int rEnd = Math.min(numRows - 1, cenRow + rows);
        int cStart = Math.max(0, cenCol - cols);
        int cEnd = Math.min(numCols - 1, cenCol + cols);

        long sum = 0;
        int count = 0;
        for (int r = rStart; r <= rEnd; r++) {
            for (int c = cStart; c <= cEnd; c++) {
                sum += mat[r][c];
                count++;
            }
        }

        return count == 0 ? 0.0 : (double) sum / count;
    }

    // Quick manual tests using the examples from the prompt
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 0, 10, 4, 0, 7, 20 },
                { 11, 5, 5, 1, 0, 3, 7 },
                { -2, 12, 4, 12, 0, 5, 0 },
                { 5, 4, 5, 13, 12, 0, 0 },
                { 10, 2, -2, 1, 5, 5, 0 },
                { 3, 1, 3, 5, 7, 3, 5 },
                { 3, 3, 5, 5, 9, 11, -5 }
        };

        double example1 = averageOfNeighborhood(mat, 3, 4, 2, 1);
        System.out.printf("Example 1: average = %.6f (expected 4.8)\n", example1);

        double example2 = averageOfNeighborhood(mat, 1, 1, 1, 2);
        System.out.printf("Example 2: average = %.6f (expected 5.25)\n", example2);
    }

}
