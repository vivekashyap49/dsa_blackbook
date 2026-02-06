import java.util.Scanner;

public class q10_AverageOfArray {

    public static double calculateAverage(int[] arr) {

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double average = calculateAverage(arr);
        System.out.println(average);

        sc.close();
    }
}
