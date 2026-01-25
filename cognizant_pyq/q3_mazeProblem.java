import java.util.*;
public class q3_mazeProblem {
    public static int zigzagExit(int N, int start, int[] arr) {
        boolean[] visited = new boolean[N];
        return backtrack(N, start, arr, visited, true);
    }

    // Backtracking helper
    private static int backtrack(int N, int curr, int[] arr,
                                 boolean[] visited, boolean moveRight) {

        // loop detected
        if (visited[curr]) {
            return -1;
        }

        visited[curr] = true; // choose
        int steps = arr[curr];

        int next;
        if (moveRight) {
            next = curr + steps;
        } else {
            next = curr - steps;
        }

        // out of bounds → exit found
        if (next < 0 || next >= N) {
            visited[curr] = false; // backtrack
            return curr;
        }

        // explore
        int result = backtrack(N, next, arr, visited, !moveRight);

        visited[curr] = false; // backtrack (undo choice)
        return result;
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {

        int N = 5;
        int S = 1;
        int[] A = {2, 3, 1, 2, 3};

        int result = zigzagExit(N, S, A);
        System.out.println(result);
    }
}
