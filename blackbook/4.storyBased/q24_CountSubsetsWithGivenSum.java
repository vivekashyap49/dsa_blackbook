public class q24_CountSubsetsWithGivenSum {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        int T = 2;

        int[][] arrays = {
                {2, 3, 5, 6, 8, 10},
                {1, 2, 3, 4, 5}
        };

        int[] sums = {10, 10};

        for (int t = 0; t < T; t++) {
            System.out.println(countSubsets(arrays[t], sums[t]));
        }
    }

    public static int countSubsets(int[] arr, int sum) {

        int[] dp = new int[sum + 1];
        dp[0] = 1; // empty subset

        for (int num : arr) {
            for (int j = sum; j >= num; j--) {
                dp[j] = (dp[j] + dp[j - num]) % MOD;
            }
        }

        return dp[sum];
    }
}
