import java.util.Scanner;

public class q16_MissingAndRepeating {

    public static void findMissingAndRepeating(int[] arr, int n) {

        long sumN = (long) n * (n + 1) / 2;
        long sumSqN = (long) n * (n + 1) * (2 * n + 1) / 6;

        long sum = 0, sumSq = 0;

        for (int num : arr) {
            sum += num;
            sumSq += (long) num * num;
        }

        long diff = sum - sumN;                // x - y
        long diffSq = sumSq - sumSqN;          // x^2 - y^2

        long sumXY = diffSq / diff;            // x + y

        long repeating = (diff + sumXY) / 2;
        long missing = sumXY - repeating;

        System.out.println("Repeating = " + repeating);
        System.out.println("Missing = " + missing);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findMissingAndRepeating(arr, n);
        sc.close();
    }
}
