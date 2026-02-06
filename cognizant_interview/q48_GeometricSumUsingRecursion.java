import java.util.Scanner;

public class q48_GeometricSumUsingRecursion {

    public static double geometricSum(int n) {

        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive case
        return geometricSum(n - 1) + 1.0 / Math.pow(2, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(geometricSum(n));

        sc.close();
    }
}
