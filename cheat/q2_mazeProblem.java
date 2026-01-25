public class q2_mazeProblem {

    public static int mazeResult(int[] A, int S) {

        int n = A.length;
        boolean[] visited = new boolean[n];

        int index = S;
        boolean moveRight = true;

        while (true) {

            // Loop detected
            if (visited[index]) {
                return -1;
            }

            visited[index] = true;
            int steps = A[index];

            int nextIndex;
            if (moveRight) {
                nextIndex = index + steps;
            } else {
                nextIndex = index - steps;
            }

            // Out of bounds
            if (nextIndex < 0 || nextIndex >= n) {
                return A[index];   // return current value
            }

            index = nextIndex;
            moveRight = !moveRight; // alternate direction
        }
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {

        int[] A = {2, 3, 1, 2, 1};
        int S = 0;

        System.out.println(mazeResult(A, S)); // Output: 2
    }
}
