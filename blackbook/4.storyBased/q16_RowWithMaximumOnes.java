public class q16_RowWithMaximumOnes {

    public static void main(String[] args) {

        int R = 3;
        int C = 3;

        int[][] M = {
                {0, 1, 0},
                {1, 1, 0},
                {1, 1, 1}
        };

        System.out.println(findRowWithMaxOnes(R, C, M)); // 3
    }

    public static int findRowWithMaxOnes(int R, int C, int[][] M) {

        int maxCount = 0;
        int rowIndex = 0;

        for (int i = 0; i < R; i++) {

            int count = 0;
            for (int j = 0; j < C; j++) {
                if (M[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                rowIndex = i;
            }
        }

        // 1-based index
        return rowIndex + 1;
    }
}
