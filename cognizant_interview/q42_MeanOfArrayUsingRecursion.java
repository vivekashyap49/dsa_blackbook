import java.util.Scanner;

public class q42_MeanOfArrayUsingRecursion {

    public static int recursiveSum(int[] arr, int index) {

        // Base case
        if (index == arr.length) {
            return 0;
        }

        // Recursive case
        return arr[index] + recursiveSum(arr, index + 1);
    }

    public static double findMean(int[] arr) {
        int sum = recursiveSum(arr, 0);
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMean(arr));
        sc.close();
    }
}
