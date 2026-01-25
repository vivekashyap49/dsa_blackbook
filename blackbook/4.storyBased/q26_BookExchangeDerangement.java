public class q26_BookExchangeDerangement {

    static final int MOD = 100000007;

    public static void main(String[] args) {

        int N = 4;
        System.out.println(countExchanges(N)); // 9
    }

    public static long countExchanges(int N) {

        if (N == 1) return 0;
        if (N == 2) return 1;

        long prev2 = 0; // !1
        long prev1 = 1; // !2
        long current = 0;

        for (int i = 3; i <= N; i++) {
            current = ((i - 1) * (prev1 + prev2)) % MOD;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }
}
