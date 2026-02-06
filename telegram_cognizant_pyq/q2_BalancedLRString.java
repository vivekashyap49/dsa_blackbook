public class q2_BalancedLRString {

    public static int minOperations(String s) {
        int n = s.length();
        int mid = n / 2;

        int L1 = 0, R1 = 0, L2 = 0, R2 = 0;

        for (int i = 0; i < mid; i++) {
            if (s.charAt(i) == 'L') L1++;
            else R1++;
        }

        for (int i = mid; i < n; i++) {
            if (s.charAt(i) == 'L') L2++;
            else R2++;
        }

        return Math.max(Math.abs(L1 - R2), Math.abs(R1 - L2));
    }

    public static void main(String[] args) {
        String s = "LLLRR";
        System.out.println(minOperations(s)); // Output: 1
    }
}
