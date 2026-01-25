public class q4_MatrixMaximumElementSwaps {

    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

        int[][] matrix = {
                {10, 5, 7},
                {11, 6, 1},
                {4, 3, 2}
        };

        findMinimumSwaps(rows, cols, matrix);
    }

    public static void findMinimumSwaps(int rows, int cols, int[][] matrix) {

        int maxValue = Integer.MIN_VALUE;
        int maxRow = 0, maxCol = 0;

        // Find maximum element and its position
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Center of matrix
        int centerRow = rows / 2;
        int centerCol = cols / 2;

        // Manhattan distance
        int swaps = Math.abs(maxRow - centerRow) + Math.abs(maxCol - centerCol);

        System.out.println(swaps + " (" + maxRow + "," + maxCol + ")");
    }
}
