import java.util.Scanner;

public class q24_SquareRootOfNumber {

    public static int findSquareRoot(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int low = 1;
        int high = n;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) mid * mid == n) {
                return mid;
            }

            if ((long) mid * mid < n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(findSquareRoot(n));

        sc.close();
    }
}
