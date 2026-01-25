import java.util.Arrays;

public class q8_SortOneArrayAccordingToAnother {

    public static void main(String[] args) {

        int[] a = {3, 1, 2};
        char[] b = {'G', 'E', 'K'};

        sortAndPrint(a, b);
    }

    public static void sortAndPrint(int[] a, char[] b) {

        int n = a.length;

        // Pair array
        int[][] pair = new int[n][2];

        for (int i = 0; i < n; i++) {
            pair[i][0] = a[i];
            pair[i][1] = b[i];
        }

        // Sort based on a[]
        Arrays.sort(pair, (x, y) -> x[0] - y[0]);

        // Print b[] according to sorted a[]
        for (int i = 0; i < n; i++) {
            System.out.print((char) pair[i][1] + " ");
        }
    }
}
